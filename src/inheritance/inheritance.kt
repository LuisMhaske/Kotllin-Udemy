package inheritance

open class Person(open val name: String, open var age: Int) {

    init {

          println("object created")
      }
    fun speak() {
        println("Hello")
    }
    fun greet(name: String) {
        println("Hello $name!")
    }

    /*fun getYearofBirth(): Int{
        return 2021 -age
    }*/
    fun getYearofBirth() = 2021 - age - 1

}
class Student(override val name: String,override var age: Int, val studentId: Long): Person(name, age){
    fun isIntelligent() = true
}
class Employee(override val name: String,override var age: Int): Person(name, age){
    fun receivePayment(){
        println("Received payment")
    }

}

fun main(args: Array<String>) {
   val student= Student("Kanchan",26, 3018234)
    student.speak()
    println("Is intelligent:" +student.isIntelligent())

    val emp = Employee("Luis", 29)
    println(emp.getYearofBirth())
    emp.receivePayment()


}