package collections

fun main() {
    val array = arrayOf("Texas", "Iowa", "California")
    println(array.contentToString())

    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    println(mixed.contentToString())
    println(mixed[3])
    println(mixed[0])

    val number = intArrayOf(1, 2, 3, 4, 5, 6)
    if (number.isEmpty()) {
        println("Is empty")

    } else {
        println("Number array contains: ")

        for (i in number.indices) print(" " + number[i])
        println(""" not empty""")

    }
    val empty: Boolean = number.isEmpty()
    println(empty)

    val states = arrayOf("Nevada", "Florida")
    val allstates = array + states
    println(allstates.contentToString())

    if (states.contains("kentucky")) {
        println("it contains the state")
    } else {
        println("Missing state")
    }
    allstates[0] = "DC"
    println(allstates.contentToString())

    println(allstates.size)


}
