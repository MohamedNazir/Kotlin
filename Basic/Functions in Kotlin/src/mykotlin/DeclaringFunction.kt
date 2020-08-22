package mykotlin

fun main(){
    connect("127.1.0.0")
    println(max(5, 3))
}

fun connect (addr : String): Unit { // return type Unit means void
    println ("Address is $addr")
}

// Function Expression
fun max(a : Int, b: Int) : Int = if (a > b) a else b