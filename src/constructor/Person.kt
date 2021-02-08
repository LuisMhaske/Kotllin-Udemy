package constructor

class Person(val name: String, var age: Int) { //standard kotlin constructor
    /* different way of building constructor
    val name: String = name
    var age: Int = age

        init {
          this.name = name
          this.age = age
          println("object created")
      }*/
    fun speak() {
        println("Hello")
    }// basic method you can have with no parameters, doesn't return any value it just performs some kind of computation


    //methods with parameter
    fun greet(name: String) {
        println("Hello $name!")
    }

    /*fun getYearofBirth(): Int{
        return 2021 -age
    }*/
    fun getYearofBirth() = 2021 - age - 1

}

fun main(args: Array<String>) {
    val person = Person("Kanchan", 26)
    person.speak()
    person.greet("world")
    println(person.age)
    println(person.name)
    println(person.getYearofBirth())


}