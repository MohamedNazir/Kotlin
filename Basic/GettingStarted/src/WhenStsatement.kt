

// Kotlin doesn't support Switch statement , it supports when statement.

val age = 25;
var eligiable = ""
fun main(args: Array<String>) {
    usingIf(age)
    usingWhen(age)
    assignmentoutofWhen(age = 11)
}

fun usingIf(age :Int) {
    if (age <1 || age >= 18){
        eligiable = "Allowed to Vote"
    }else{
        eligiable = "Not allowed to Vote"
    }
    println(eligiable)
}

fun usingWhen(age :Int) {
    when {
        age <1 || age >= 18 -> eligiable = "Allowed to Vote"
        else -> eligiable = "Not allowed to Vote"
    }
    println(eligiable)
}

fun assignmentoutofWhen(age :Int) {
    eligiable = when {
        age in 18..0 -> "Allowed to Vote"
        else -> "Not allowed to Vote"
    }
    println(eligiable)
}
