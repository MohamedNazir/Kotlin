import java.time.LocalDateTime

// Inteface in kotlin supports default method,s
//kotlin also supoprts properties in interface.

interface Time {
    fun setTime(hours :Int, minute: Int =0, secs :Int =0 )
    fun setTime(time :RizanTime)  = setTime(time.hours)   // default Implementation like Java 8
}



class YettiTime : Time{
    override fun setTime(hours: Int, minute: Int, secs: Int) {
        val currentDateTime = LocalDateTime.now()
        println("current Time is $currentDateTime")
    }

}

class RizanTime{
    var hours: Int =0
    var minute: Int =0
    var secs: Int =0
}