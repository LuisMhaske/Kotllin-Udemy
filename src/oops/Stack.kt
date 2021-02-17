package oops

import javax.lang.model.util.Elements

//DRY = Don't Repeat yourself

// Generic class
class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}
fun <T> stackOf(vararg elements: T): Stack<T>{
    return Stack(*elements)
}


fun main() {
    val stack = Stack(3, 5, 2, 8)
    stack.push(11)

    val stack2 = stackOf("hi","hello","Hey")
    for (i in 1..3){
        println(stack2.pop())
    }
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    println(stack.pop())
}