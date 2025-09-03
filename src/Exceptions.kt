import java.lang.IllegalStateException

fun main (args: Array<String>){

    print("What product do you want to buy? ")
    val product = readln()

    print("Please enter how many products you want to buy:")
    var userInput = readln()
    val price = 29.99F
    try {
        val products = userInput?.toInt()
        val total = products?.times(price)
        println("The total cost for $products $product is $total")
    } catch (e: Exception){
        println("Sorry, an exception occurred:\n ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Thank you for shopping with us!")
    }

    println("Please enter a kilometer value:")
    var userInput2 = readln()
    try {
        val km = userInput2?.toDouble()

        println("The value in miles is ${km?.times(0.621371)}")
    } catch (e: Exception){
        println("Sorry, an exception occurred:\n ${e.localizedMessage}")
        e.printStackTrace()
    }

    var test = readln()
//    throw IllegalStateException("Sorry, an exception occurred")

    var test2 = readln()

    try{
        println(test2?.toInt())
    } catch (e: Exception){
        println("Sorry, an exception occurred:\n ${e.localizedMessage}")
        e.printStackTrace()
    }
}