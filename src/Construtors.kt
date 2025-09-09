fun main (args: Array<String>){
    var car = MyCarBag("Toyota", 180)
    var car2 = MyCarBag("Honda")
    var car3 = MyCarBag()

}

class MyCarBag{

    constructor(){
        model = "Unknown"
        topSpeed = 150
        println("Car $model with top speed of $topSpeed km/h has been created.")
    }

    constructor(newModel: String){
        model = newModel
        topSpeed = 150
        println("Car $model with top speed of $topSpeed km/h has been created.")
    }

    constructor(newModel: String, newTopSpeed: Int){
        model = newModel
        topSpeed = newTopSpeed
        println("Car $model with top speed of $topSpeed km/h has been created.")
    }

    var model: String? = null
    var topSpeed: Int = 100
}

//class MyCarBag(var model: String, var topSpeed: Int){
//
//    init {
//        println("Car $model with top speed of $topSpeed km/h has been created.")
//    }
//
//    fun getModel(){
//        println("The model is $model")
//    }
//
//    fun start(){
//        println("The car is starting")
//    }
//
//    fun drive(speed: Int){
//        println("Driving at $speed km/h")
//    }
//}