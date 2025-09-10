fun main (args: Array<String>) {
//    val animals: List<String> = listOf("dog", "cat", "elephant", "tiger", "lion", "rat", "girrafe")
//    animals.map { it.length }
//        .filter { it > 3 }
//        .let{ list: List<Int> -> println(list) }
//        .let{ filteredList ->
//            println(filteredList)
//            println("Total items: ${filteredList.size}")
//        }

    with(STCar()){
        speed = 30
        accelerate()
        println("Current speed: $speed")
        applyBrakes()
        applyBrakes(2)
        println("Current speed: $speed")
    }
}

class STCar {
    var speed: Int = 0
        set(value){
            //make sure speed is never negative
            if(value < 0){
                field = 0
                return
            }
            field = value
        }
    var color: String = "Red"
    var model: String = "BMW"

    fun applyBrakes() {
        println("Applying brakes")
        this.speed -= 10
    }

    fun accelerate() {
        println("Accelerating")
        this.speed += 10
    }

    fun applyBrakes(decrement: Int) {
        println("Applying brakes with decrement: $decrement")
        this.speed -= decrement
    }
}