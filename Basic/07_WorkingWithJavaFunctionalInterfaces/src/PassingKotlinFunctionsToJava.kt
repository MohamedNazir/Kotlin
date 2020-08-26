import myJava.User

fun main(){
    var user = User("Rizan")
    user.create { println("User $it has been created ") }
}