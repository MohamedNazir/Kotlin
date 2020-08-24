import com.sun.scenario.effect.impl.sw.sse.SSELinearConvolvePeer

// sealed classes lets us to restrict the class hierarchy.
// when you have restricted set of derived classes, use Sealed classes

sealed class PersonEvent{
    class Awake : PersonEvent()
    class Sleep : PersonEvent()
    class Eating(val food : String ="Biryani") : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Person is awake")
        is PersonEvent.Sleep -> println("Person is sleeping")
        is PersonEvent.Eating -> println("Person is eating ${event.food}")
    }
}