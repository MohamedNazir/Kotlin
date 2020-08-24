
// companion object an be used for factory method.
// this can be used to create static function in kotlin.

/*
    1. an object declaration inside a calss is is marked with comapnion keyword
    2. Companion object is initialized when the class is loaded
    3. Object declaration are intialized lazily when accessed.
 */

object Value1{
    val pi = 3.14
}

class Value2{
    companion object{
        val pi2 = 3.14235
    }
}

fun main(){
    println(Value1.pi) // calling an object instance
    println(Value2.pi2) // calling a companion object
}