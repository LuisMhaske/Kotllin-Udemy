package functions

import java.util.*

//no parameter, no return values
fun helloworld() {
    println("Hello World")
}

//KOTLIN -> K O T L I N
// 1 parameter, no return vale
fun printwithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

//no parameter, but returns Date
fun getCurrentDate(): Date {
    return Date()
}

fun main() {
    helloworld()
    printwithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(17, 42))
}