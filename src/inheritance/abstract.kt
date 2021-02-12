package inheritance

abstract class Person2(open val name: String, open var age: Int) {

   abstract fun speak()
   open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearofBirth() = 2021 - age - 1

}
class Student2(override val name: String,override var age: Int, val studentId: Long): Person2(name, age){
    override fun speak() {
        println("Hi there! I am a student.$studentId")
    }
    fun isIntelligent() = true
}
class Employee2(override val name: String,override var age: Int): Person2(name, age){
    override fun speak() {
        println("Hi there! I am a Employee.")
    }

    override fun greet(name: String){
        super.greet(name)
        println("Howdy $name")
    }

    fun receivePayment(){
        println("Received payment")
    }

}

fun main() {
    val student= Student2("Kanchan",26, 3018234)
    student.speak()
    println("Is intelligent:" +student.isIntelligent())

    val emp = Employee2("Luis", 29)
    println(emp.getYearofBirth())
    emp.greet("sir")
    emp.receivePayment()
    emp.speak()
}