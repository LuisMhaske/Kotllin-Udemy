package collections


fun main() {
    val array = arrayOf("Texas", "Iowa", "California")
    println(array.contentToString())
    array[0] = "DC"
    println(array.contentToString())

    val list = listOf("orange", "apple", "Bananas")
    println(list)
    println(list.elementAt(1))

    val arrarList = arrayListOf("Luis", "Kanchan", "Lily")
    println(arrarList)
    arrarList.add("Rose")
    println(arrarList)
    arrarList.add("Sage")
    println(arrarList)
}