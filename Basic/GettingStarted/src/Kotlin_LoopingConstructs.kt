import java.util.*

// while and do while are same as Java

fun main(args : Array<String>){

    for( i in 1..10){
        print(i)
    }
    println()
    for( i in 1..10 step 2){
        print(i)
    }
    println()
    for( i in 10 downTo 1){
        print(i)
    }
    println()
    for( i in 1 until 10){
        print(i)
    }
    println()

    var ages = TreeMap<String, Int>()
    ages.put("Rizan" , 27)
    ages.put("Treo" , 4)
    ages.put("Sally" , 20)

    for ((name,age ) in ages){
        println("$name is $age")
    }

    var numbers = listOf<Int>(1,2,3,4,5,6,7,34)
    for ((index,element ) in numbers.withIndex()){
        println("$index is $element")
    }

    var range = 1..10
    var char_range = 'a'..'z'

    for( (index, element) in char_range.withIndex()){
        println("The character $element is at index ${index+1}")
    }

}