package conditionals

fun main() {
    val age = 23
    if (age < 18) {
        println("You can not register!!!")
    } else if (age < 25) {
        println("Well you can register...")
    } else {
        println("Welcome!!")
    }
    println("The End")
}