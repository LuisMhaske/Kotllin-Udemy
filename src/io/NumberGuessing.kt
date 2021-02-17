package io

import kotlin.random.Random


fun main(args: Array<String>) {
    val number = Random.nextInt(100)+1
    var input: String?
    var guess = -1

    while (guess != number){
        print("Guess a number between 1 and 100:")
        input = readLine()
        if (input !=null){
            guess = input.toInt()
        }

        if(guess < number){
            println("Too Low")
        }else if (guess > number){
            println("Too Large")
        }else{
            println("You Won!!!!")
        }
    }
}