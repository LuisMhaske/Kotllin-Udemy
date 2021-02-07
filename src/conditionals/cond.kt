package conditionals

fun main() {
    print("Select Mode: ")
    val mode = Integer.valueOf(readLine())
    val result = when (mode) {
        1 -> "The mode is lazy"

        2 -> {
            println("The mode is 2")

            "So the mode is busy"
        }

        3 -> "The mode is super productive!!!!"
        else -> "Invalid mode"


    }
    println(result)

    val x = if (mode > 3) {
        println("new mode")
        "next"
    } else {
        println("the end")
        "done"
    }
    println(x)

}

