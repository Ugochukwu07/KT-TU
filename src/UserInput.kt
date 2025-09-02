import kotlin.random.Random

fun main (args: Array<String>){
    //Implicit and Explicit Types
    var dog: Byte = 5
    println(dog::class.java)

    //PRACTICE
    println("Hello, what is your name?")
    val userName = readLine()?:""
    println("Hello, $userName! Welcome to Kotlin programming.")

    println("Enter a number:")
    val userInput1 = readlnOrNull() ?:""
    val userNumber1 = userInput1.toInt()
    val randomFloat = Random.nextDouble(14.99, 500.00)
    val outcome = userNumber1 * randomFloat
    println("Your number multiplied by a random float ($randomFloat) is $outcome and type is ${outcome::class.java}")

    println("Enter a number:")
    val userInput2 = readLine()?:""
    val userNumber = userInput2.toIntOrNull() ?: 0
    println("Your number multiplied by 5 is ${userNumber * 5}")

    println("What is your birth year?")
    val userInput3 = readLine()?:""
    val birthYear = userInput3.toIntOrNull() ?: 0
    val currentYear = 2025
    val age = currentYear - birthYear
    println("You are $age years old.")

    // RANDOM NUMBER
    println(Random.nextInt())
    println(Random.nextInt(100))
    println(Random.nextInt(20, 30))

    println(Random.nextDouble())

    println("Input Number to Double:")
    val userInput4 = readLine()?:""
    println("Your input is ${userInput4.toInt() * 2}")

    println("Input your name:")
    val userInput = readLine()?:"Nobody"
    val userInputInt = userInput.toIntOrNull() ?: 0
    println(userInputInt)
    println("Your name has ${userInput.length} characters")
    println("Your name reversed is ${userInput.reversed()}")
    println("The first character of your name is ${if (userInput.isNotEmpty()) userInput[0] else ' '}")
    println("The last character of your name is ${if (userInput.isNotEmpty()) userInput[userInput.length - 1] else ' '}")
    println("The name in uppercase is ${userInput.uppercase()}")
    println("Hello, $userInput!")
}