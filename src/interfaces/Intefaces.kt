package interfaces

interface Driveable{

    fun drive()
}
interface Buildable{
    val timeRequired:Int            //we cant initiate or give a value for the variable as interface cannot have a state so each of our class having the current interface will also have this property
    fun built()
}

class car(val color: String):Driveable, Buildable{

    override val timeRequired: Int = 120    //class car is implementing the interface Buildable therefore we have to define its property as well.

    override fun drive() {
        println("Driving car")
    }

    override fun built() {
        println("Built a car")
    }
}

fun main() {
    /*val car = car("blue")
    car.built()*/
    val car: Driveable = car("Blue")
    car.drive()
}