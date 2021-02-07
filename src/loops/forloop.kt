package loops

fun main() {
    var sum = 0
    for (i in 1..10) {
        println(i)
        sum += i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python")
    for (element in list) {
        println(element)
    }
    for ((index, value) in list.withIndex()) {
        println("Element at index $index is $value")
    }
}