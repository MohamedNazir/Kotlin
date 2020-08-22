@file:JvmName("DefaultParameters")

package mykotlin

@JvmOverloads  // this annotation is used to call this method from java, with or without parameters, so at run time this method will be overloaded in java.
fun logMessage(message: String = "default message logged"): Unit {
    println("$message")
}

fun main() {
    logMessage("I am passing a log message")
    logMessage()
}

/** In order to call the default parameters from a JAva file, It is not possibel.
        Hence we need to add @JVMOverride annotation in the kotlin class to do that **/
