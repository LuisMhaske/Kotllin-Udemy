package oops

open class Animal {
     var age: Int = 0
    protected var name ="Sam"
        /*get() = field*///redundant getter
       /* set(value) {
            if (value>=0){
                field = value
            }
            else{
                println("Age can only be above 0")
            }
        }*/

}

fun main() {
    val animal = Animal()
    println(animal.age)
    animal.age = 8
    animal.age = -2
    println(animal.age)
}