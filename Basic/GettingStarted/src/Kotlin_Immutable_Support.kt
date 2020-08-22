fun main(args :Array<String>) {

    var q:Person = Person()
    q.firstName = "Mohamed"
    q.lastName = "Nazir"
    println(q)
    println("Full name is ${q.firstName} ${q.lastName}.")

    val immutablePerson = ImmutablePerson();
    immutablePerson.firstName = "Rizan"
    println(immutablePerson);
    //immutablePerson = ImmutablePerson(); // val cannot be reassigned.

    val immutablePersonFields = ImmutablePersonFields();
    //immutablePersonFields.firstName = "Rizan"  // val cannot be re-assigned
    println(immutablePersonFields);
    //immutablePerson = ImmutablePerson(); // val cannot be re-assigned.

}

class Person{
    var firstName:String = ""
    var lastName = ""

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }
}

class ImmutablePerson{
    var firstName:String = ""
    var lastName = "Provided Last Name"

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }
}

class ImmutablePersonFields{
    val firstName:String = "Default First Name"
    val lastName = "Default Last Name"

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }
}