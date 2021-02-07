package conditionals

fun main() {
    var mode = 0
    loop@ while (mode != 3) {
        print("Select Mode: ")
        mode = Integer.valueOf(readLine())
        when (mode) {
            1 -> println("The mode is lazy")

            2 -> {
                println("The mode is 2")
                println("So the mode is busy")
            }
            3 -> println("The mode is super productive!!!!")
            else -> {
                println("Invalid mode")
                continue@loop
            }
        }


    }


}