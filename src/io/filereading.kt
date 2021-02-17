package io

import java.io.File

fun main(args: Array<String>) {
    var linenum:Int = 0
    File("src/inputfile.txt").forEachLine {
        ++linenum
        println("#$linenum: $it")
    }
}