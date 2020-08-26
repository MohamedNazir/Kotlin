import java.util.*

fun main() {
    //List
    val people = listOf<String>("Test","two","Three")
    val people2 = mutableListOf<String>("Four","Five","Six")
    people2.add("Seven")
    println(people2)

    // Map
    val chars = mapOf(97 to "a", 98 to "b", 120 to "x")
    println(chars)

    val user = mutableMapOf("name" to "Luke", "age" to "23")
    user.put("city","Chennai");
    println(user)

    val items = TreeMap<String, Int>();
    items["B"] = 90
    items["A"] = 80
    items["C"] = 70

    for ((k, v) in items) {
        println("$k = $v")
    }


}


