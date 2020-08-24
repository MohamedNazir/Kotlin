

class course ( val id :Int, val title:String){}

object courses{
    val allCourses = ArrayList<course>();
}

open class student(val id :Int, val name:String){
    fun enrolledCourses(courseName : String){
        val course = courses.allCourses.filter { it.title == courseName }.firstOrNull();
    }
}