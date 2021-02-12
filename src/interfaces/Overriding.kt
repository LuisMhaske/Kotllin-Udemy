package interfaces

abstract class Course(val topic: String, val price: Double) {
    open fun learn(){
        println("Learning $topic Course")
    }
}

interface Learnable{
    fun learn(){
        println("Learning...")
    }
}

open class KotlinCourse(): Course("Kotlin",11.99),Learnable {

    //final keyword to declare the method as final so that it can't be overriden in child classes
    final override fun learn() {
        super<Course>.learn() //super refers to our parent class and will return the value store in that method
        super<Learnable>.learn() //<> are used to denote from where we are pulling the method from
        println("It's fun!!!")
    }
}
/*class Kotlinplus() : KotlinCourse() {
    override fun learn() {}
}cannnot override the learn method in this child class as the method is declared final*/

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}