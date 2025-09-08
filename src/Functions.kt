fun main (args: Array<String>){
//    for(i in 1..3){
//        sayHello()
//    }
//
//    for(j in 1..2){
//        multiplyNumber()
//    }

//    for (k in 1..3){
//        double(k)
//    }

//    val persons = listOf("Alice", "Bob", "Charlie")
//    sayHelloToPersons(persons)

    doubleMessage(5)
    doubleMessage(10, "The double value is ")
}

fun doubleMessage(number: Int, message: String = "Double is ") {
    println("$message ${number * 2}")
}

fun sayHello(){
    println("Hello world")
}

fun multiplyNumber(){
    println("Please enter a number to multiply by 17")
    val input = readLine()!!.toInt()
    val result = input * 17
    println("The result is $result")
}

fun double(x: Int) {
    println("The double of $x is ${x * 2}")
}

fun sayHelloToPersons(persons: Collection<String>){
    for(person in persons){
        println("Hello $person")
    }
}