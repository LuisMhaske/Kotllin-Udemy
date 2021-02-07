package collections

fun main() {
    val arrarList = arrayListOf("Luis", "Kanchan", "Lily")
    println(arrarList)
    println(arrarList[0])
    val list = arrayListOf("Rose", "Sage")
    println(arrarList + list)
    println(arrarList.size)
    println(arrarList.isEmpty())
    println(arrarList.contains("Sage"))

    val alist = arrayListOf("Patrick", "Michael", "Sarah")
    alist.add("Jack")
    alist.add(1, "Josh")
    println("Element added")

    val removed = alist.remove("jose")
    println(alist)
    println(removed)

    val sublist = alist.subList(1, 5)
    println(sublist)

}