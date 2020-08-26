import java.lang.Exception

fun main() {
    val ints = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    var i = first(ints, {i -> i%3 ==0})
    println(i)
}

fun <T> first(items : List<T>, predicate: (T) -> Boolean ) :T{
    for (item in items){
        if(predicate(item)) return item
    }
    throw Exception()
}