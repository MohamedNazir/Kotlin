
var message:String = ""
val name = "Rizan"

fun main(args : Array<String>){
   conditoncheck1("rizan")
    conditoncheck2("Rizan")
}

fun conditoncheck1(input: String){
    if(input == name){
        message = "Right Answer"
    }else{
        message = "Try again."
    }
    println(message)
}

fun conditoncheck2(input: String){  // If statement as a value

    message = if(input == name) "Right Answer" else "Try again."
    println(message)
}
