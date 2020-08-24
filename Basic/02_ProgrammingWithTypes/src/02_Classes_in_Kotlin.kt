
// Classes are Final by default, in Java classes are open by default
// public by default.
// need to use "open: keyword in class and method to derive it from.

open class Person {
    var firstName : String = ""
    var age:Int = 0;
    open fun getPerson():String = "The person name is $firstName, age is $age" // another way of a method
}

class student : Person() {
    override fun getPerson():String{
        return " from derived class"
    }
}

// classes can also be abstract.

abstract class Person1{
    var firstName : String = ""
    var age:Int = 0;

    open fun getPerson():String = "The person name is $firstName, age is $age"
    abstract fun getAddress() :String
}
class student1 : Person1(){
    override fun getPerson():String{
        return " from derived class"
    }
    override fun getAddress(): String = "return some address "
}