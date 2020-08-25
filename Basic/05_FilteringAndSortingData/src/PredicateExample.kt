import java.time.LocalDateTime

fun main() {
    var ints = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


    val greate = ints.all { it > 5 }
    println(greate)

    val anygreate = ints.any { it > 5 }
    println(anygreate)

    val countgrea = ints.count{it >5}
    println(countgrea)

     var found = ints.find { it >3 }
    println(found)

   var start = System.currentTimeMillis()

   var test = ints.filter { it % 2 == 0}
    var end = System.currentTimeMillis()
    print( end - start)
    for ( i :Int in test) print(i)


}