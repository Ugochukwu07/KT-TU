fun main(args: Array<String>){

    var myCar: Car = Car()
    myCar.model = "Toyota"
    myCar.topSpeed = 180
    myCar.getModel()
    myCar.drive(150)

    var yourCar = Car()
    yourCar.model = "Honda"
    yourCar.topSpeed = 200
    yourCar.getModel()
    yourCar.drive(180)
}

class Car {
    var model: String? = null

    var topSpeed = 100

    fun getModel() {
        println("The model is $model")
    }

    fun start(){
        println("The car is starting")
    }

    fun drive(speed: Int){
        println("Driving at $speed km/h")
    }
}
