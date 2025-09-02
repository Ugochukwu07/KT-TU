fun main (args: Array<String>){
    var numCow = 3
    var numCowWithMilk = 1
    var numChild = 2

    val hasMoreThanFiveAnimals = numCow > 5
    val produceSold = numCowWithMilk > 1
    val hasThreeOrMoreMembers = numChild >= 3

    val isEligible = !hasMoreThanFiveAnimals && produceSold && hasMoreThanFiveAnimals
    println(isEligible)

    println("Please enter your account balance:")
    val userInput = readLine()?:"0"
    val balance = userInput.toDoubleOrNull() ?: 0.0

    val intrestRate: Float = 5.5F/100
    val time: Int = 5

    val intrest = balance * intrestRate * time
    val total = balance + intrest
    println("User will have $intrest as intrest in $time years")
    println("Total balance after $time years is $total")

    println(5+2)
    println("Hi" + " John" + "!" )

    val div = 10 / 3
    println(div.toFloat()   )

    val unit_kilo = 29.99
    val qunatity = 1F/3

    val cost = unit_kilo * qunatity
    println("Cost: $cost")
}