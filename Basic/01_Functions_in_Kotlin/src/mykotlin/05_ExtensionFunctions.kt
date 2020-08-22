package mykotlin

// Very Important.
// can add function to classes which in not written/owned by you.
// when you add extension function Kotlin generates them as static functions.
// It cut downs the user of utility classes. no need to Util classes
// It makes code much easier to read.


fun main() {
   var text = "With     Multile \t white    spaces"
    println(text)
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())

    var s1 = Student(74, "Rizan")
    var s2 = Student (97, "Nazir")

    println("Is Excellent student :" + s1.isExcellent())
    println("Is Excellent student :" + s2.isExcellent())
}

//Helper or Util function
fun replaceMultipleWhiteSpace(message : String) : String{
    var regex = Regex("\\s+")
    return regex.replace(message, " ")
}

//Extension Function
fun String.replaceMultipleWhiteSpaceEx() : String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

//Extension Function, Here assume Student class is not our class,
fun Student.isExcellent():Boolean{
 return this.mark > 90
}

data class Student(var mark : Int, var name:String)