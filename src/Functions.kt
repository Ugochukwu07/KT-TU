fun main (args: Array<String>){
    for(i in 1..3){
        sayHello()
    }

    for(j in 1..2){
        multiplyNumber()
    }
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