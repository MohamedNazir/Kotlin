//Primary Constructors

//way 1
open class Person2{
    val name:String =""
}

//way 2
class Person3(_name :String){
    val name = _name;
}
//way 3
class Person4(_name : String){
    val name:String
    init {
        name = _name
    }
}

//Secondary Constructors

open class Person5(name : String){
    constructor(name:String, age :Int):this(name)
}


