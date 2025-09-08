import kotlin.random.Random

fun main (args: Array<String>){
    val myLamda: (Int, Int) -> Int = {x, y -> x + y}
    println(myLamda(4, 5))

    val myLamda2 = {name: String -> println("Hello $name")}
    myLamda2("Ugochukwu")

    val names = arrayListOf("Alice", "Bob", "Charlie", "David")
    sayHello(names, {name: String -> println("Hello $name")})
    //or
    sayHello(names) {name: String -> println("Hello $name")}
    //or
    sayHello(names) { println("Hello $it") }


    val clients = arrayListOf("Alice", "Bob", "Charlie", "David")
    var newClients = clientsHOF(clients){
        name: String -> "Hello Mr. $name"
    }

    println(newClients)

    val plants: ArrayList<String> = arrayListOf("Cactus", "Fern", "Bamboo", "Palm", "Moss", "Pine", "Tulip", "Rose", "Daisy", "Orchid")
    plants.sortBy { it.length }
    plants.forEach { println(it + " is number ${ Random.nextInt(plants.size)}") }

    var plantLength: ArrayList<Int> = plants.map{ it.length } as ArrayList
    println(plantLength)
    println(plants)

    var max = plants.maxByOrNull { it.length }
    println("The longest plant name is $max")

    var min = plants.minByOrNull { it.length }
    println("The shortest plant name is $min")


//    practice
    var numbers: ArrayList<Int> = arrayListOf(1, 2, 3, 37, 70, 4, 4, 5, 6, 7, 8, 9, 10)
    var doubleDigits = numbers.filter { it in 10..<100 } as ArrayList
    println(doubleDigits)

    var randomInt: Array<Int> = Array(15) { Random.nextInt(1, 200) }
    var processedInt = randomInt.map { if (it % 2 == 0) it/2 else it * 2 }
    println(randomInt.asList())
    println()
    println(processedInt.filter { it > 25 })
}

fun clientsHOF(clients: ArrayList<String>, doSomething: (String) -> String): ArrayList<String> {
    var newClients = arrayListOf<String>()
    for(client in clients){
         newClients.add(doSomething(client))
    }

    return newClients
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit){
    for(name in names){
        doSomething(name)
    }
}