package mykotlin

fun main() {
    val h1 = Header("First")
    val h2 = Header("Second")
    val h4 = h1.plus_Extension(h2)   // Extension function
    val h5 = h1 plus_Infix h2    // Infix function
    val h6 = h1 + h2  // using operator and infix
    println(h4.name)
    println(h5.name)
    println(h6.name)
}

data class Header(var name: String)

// Extension function
fun Header.plus_Extension(other: Header): Header {
    return Header(this.name + other.name)
}

//using infix
infix fun Header.plus_Infix(other: Header): Header {
    return Header(this.name + other.name)
}

// using Operator Overloading and infix

//using infix
infix operator fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}