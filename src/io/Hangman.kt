package io

class Hangman {
}

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null){
        println("No word given, game ended.")
        return
    }
    for (i in 1..100){
        println()
    }
    //TREE
    //tree
    //['t','r','e','e']
    //{'t','r','e'}
    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

   while(letters != correctGuesses){

       printExpolredWord(word, correctGuesses)
       println("#Wrong guesses: $fails\n")

       print("Guess a letter: ")
       val input = readLine()

       if (input == null){
          continue
       }
       else if (input.length != 1){
           println("please enter a single character")
           continue
       }
       if (word.toLowerCase().contains(input.toLowerCase())){
           correctGuesses.add(input[0].toLowerCase())
       }else{
           fails++
       }
    }
    printExpolredWord(word,correctGuesses)
    println("#Wrong guesses: $fails\n\n")
    println("Well Done!")
   /* printExpolredWord("Kotlin", mutableSetOf('o','l','i'))
    printExpolredWord("kotlin", mutableSetOf())*/
}

fun printExpolredWord(word: String, correctGuesses: Set<Char>){
    for(character in word.toLowerCase()){
        if (correctGuesses.contains(character))
        {
            print(character+" ")
        }else{
            print("_ ")

        }

    }
    println()
}