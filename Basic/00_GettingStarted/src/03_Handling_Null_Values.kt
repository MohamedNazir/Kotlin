fun main(){

   var p:PersonForNull ? = PersonForNull();
    println(p?.firstName)
}

class PersonForNull{
    var firstName:String ? = null  // by default Kotlin won't support null, in case if we want to explicily use null, then we can add a ? at the end of the variable.
    var lastName = ""

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }
}