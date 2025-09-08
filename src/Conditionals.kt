fun main (args: Array<String>){

    println("Please enter a number")
    val input = readLine()!!.toInt()
    var j = 1
    var result = 1
    while (j <= input){
        result *= j
        j++
    }
    println("The factorial of $input is $result")

    //While Loop
    var i = 0
    while (i < 10){
        println(i)
        i++
    }

    val name = "ugochukwu"
    when(val length = name.length){
        in 1..5 -> println("name of ${length} is a short name")
        in 6..10 -> println("name of ${length} medium name")
        else -> println("name of ${length} of charters long name")
    }

    val animal = readLine()
    var action: String;

    when(animal){
        "cat" -> action = "meow"
        "dog" -> action = "bark"
        "cow" -> action = "moo"
        else -> {
            action = "unknown"
            println("unknown animal")
        }
    }

    println("When you meet a $animal, it will $action")
}