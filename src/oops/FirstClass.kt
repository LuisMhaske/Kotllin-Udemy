package oops

class Person {
    var name: String = "Kanchan" //properties
    var age: Int = 26 //properties

    //adding functionality to our person class by creating methods
    //methods are basically just function inside a class
    fun speak() {
        println("Hello")
    }// basic method you can have with no parameters, doesn't return any value it just performs some kind of computation


    //methods with parameter
    fun greet(name: String) {
        println("Hello $name!")
    }

}

fun main(args: Array<String>) {
    val person = Person()
    person.speak()
    person.greet("world")
    println(person.age)
    println(person.name)


}