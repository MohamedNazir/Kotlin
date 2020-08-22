import java.lang.NumberFormatException

fun main(args: Array<String>){

   println(parseValue("53"))
    println(parseValue("ABC"))
}

private fun parseValue(x: String): Int {

    try {
        return Integer.parseInt(x)
    } catch (e: NumberFormatException) {
        e.printStackTrace();
    }
    return 0;
}