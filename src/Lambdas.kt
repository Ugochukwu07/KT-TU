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

    val plants: ArrayList<String> = arrayListOf("Cactus", "Fern", "Bamboo", "Palm")
    plants.sortBy { it.length }
    plants.forEach { println(it + " is number ${ Random.nextInt(plants.size)}") }

    var plantLength: ArrayList<Int> = plants.map{ it.length } as ArrayList
    println(plantLength)
    println(plants)
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