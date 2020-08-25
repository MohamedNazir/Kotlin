fun main() {
    var ints = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    var filtered = ints.filter { it %2 ==0 }

 //   for(i:Int in filtered) println(i)

    var squaredInts = ints.map { it * it }

 //   for(i:Int in squaredInts) println(i)

    val combined = ints.filter { it %2 ==0 }.map { it * 2 }
    for(i:Int in combined) println(i)

}