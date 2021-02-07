package conditionals

import java.util.*

fun main() {
    val random = Random().nextInt(50) + 1
    println("value is $random")

    when (random) {

        in 1..10 -> println("$random is between 1 to 10.")
        in 11..20 -> println("$random is between 11 to 20.")
        in 21..30 -> println("$random is between 21 to 30.")
        in 31..40 -> println("$random is between 31 to 40.")
        else -> println("$random is above 40")
    }
}