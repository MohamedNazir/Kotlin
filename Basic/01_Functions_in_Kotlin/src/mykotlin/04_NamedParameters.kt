package mykotlin


fun address(street: String, doorNumber: Int , city : String): Unit {
    println("Your address is #$doorNumber, $street, $city .")
}

fun main() {
    address("New Street", 23, "Chennai")
    address(doorNumber = 12, city="Bangalore", street = "Ring filed street")
}