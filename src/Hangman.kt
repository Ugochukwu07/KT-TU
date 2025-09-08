import java.util.Locale
import java.util.Locale.getDefault

val words = generateRandomWords(40)
var word = ""
val guessedLetters = arrayListOf<Char>()
val remainingGuesses = 6
var mistakes = 0


fun main(args: Array<String>){
    setUpGame()
}

fun setUpGame(){
    val wordIndex: Int = (0 until words.size).random()
    word = words[wordIndex].uppercase(getDefault())
    println(word)

    for (i in word.indices){
        guessedLetters.add('_')
    }

    printGameStatus()

    var gameOver = false
    do {
        println("Enter your guess: ")
        val input = readLine()!!.uppercase(getDefault())
        if (input.length != 1 || !input[0].isLetter()){
            println("Please enter a single letter.")
        } else {
            var letter: Char = input[0]
            if(word.contains(letter)){
                for (i in word.indices){
                    if (word[i] == letter){
                        guessedLetters[i] = letter
                    }
                }
                if (!guessedLetters.contains('_')){
                    printGameStatus()
                    println("Congratulations! You've guessed the word: $word")
                    gameOver = true
                } else {
                    printGameStatus()
                }
            } else {
                mistakes++
                if (mistakes >= remainingGuesses){
                    printGameStatus()
                    println("Sorry, you've run out of guesses. The word was: $word")
                    gameOver = true
                } else {
                    printGameStatus()
                }
            }
        }
    } while (!gameOver)

    if(mistakes == 6){
        printGameStatus()
        println("Would you like to play again? (Y/N)")
        val playAgainInput = readLine()!!.uppercase(getDefault())
        if (playAgainInput == "Y"){
            mistakes = 0
            guessedLetters.clear()
            setUpGame()
        } else {
            println("Thanks for playing!")
        }
    } else {
        //clear the terminal
        print("\u001b[H\u001b[2J")

        println("Would you like to play again? (Y/N)")
        val playAgainInput = readLine()!!.uppercase(getDefault())
        if (playAgainInput == "Y"){
            mistakes = 0
            guessedLetters.clear()
            setUpGame()
        } else {
            println("Thanks for playing!")
        }
    }
}

fun printGameStatus(){
    when(mistakes){
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("\nWord: ")
    for (letter in guessedLetters) {
        print("$letter ")
    }
    println("\n\nGuesses left: ${remainingGuesses - mistakes}")
    println("Guessed letters: ${guessedLetters.filter { it != '_' }}")
}

fun print0Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |")
    println("  |")
    println("  |")
    println("  |")
    println(" /|\\")
    println("//|\\\\" )
}

fun print1Mistake(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |")
    println("  |")
    println("  |")
    println(" /|\\")
    println("//|\\\\" )
}

fun print2Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |     |")
    println("  |     |")
    println("  |")
    println(" /|\\")
    println("//|\\\\" )
}

fun print3Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |    /|")
    println("  |     |")
    println("  |")
    println(" /|\\")
    println("//|\\\\" )
}

fun print4Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |    /|\\")
    println("  |     |")
    println("  |")
    println(" /|\\")
    println("//|\\\\" )
}

fun print5Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |    /|\\")
    println("  |     |")
    println("  |    / ")
    println(" /|\\")
    println("//|\\\\" )
}

fun print6Mistakes(){
    println("  |-----|-")
    println("  |     |")
    println("  |     O")
    println("  |    /|\\")
    println("  |     |")
    println("  |    / \\")
    println(" /|\\")
    println("//|\\\\" )
    println("GAME OVER!")
}

fun generateRandomWords(length: Int): ArrayList<String>{
    val words = arrayListOf<String>()
    val wordsToChooseFrom = listOf("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugli", "vanilla", "watermelon", "xigua", "yam", "zucchini")
    val moreWords = listOf("avocado", "blueberry", "cantaloupe", "dragonfruit", "elderberry", "feijoa", "gooseberry", "honeydew", "jackfruit", "kumquat", "lime", "mulberry", "olive", "persimmon", "quararibea", "rambutan", "soursop", "tamarind", "ugni", "voavanga", "wolfberry")
    words.addAll(wordsToChooseFrom)
    words.addAll(moreWords)
    words.shuffle()
    if (length < words.size){
        return ArrayList(words.subList(0, length))
    }
    return words
}

