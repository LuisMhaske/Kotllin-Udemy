package conditionals

fun main() {
    print("Select Mode: ")
    when (Integer.valueOf(readLine())) {
        5 -> println("x is 5")
        3 * 12 -> println("x is 3*12")
        "Hey".length -> println("x is the length of 'Hey'")
        in 1..10 -> println("x is in between 1 to 10")
        !in 1..10 -> println("x is not in between 1 to 10")
    }
}