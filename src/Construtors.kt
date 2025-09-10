fun main (args: Array<String>){
    var car = MyCarBag("Toyota", 180)
    var car2 = MyCarBag("Honda")

    var car3 = MyCarBag()
    car3.topSpeed = 200
    println(car3.model)
    println(car3.topSpeed)

    var user = User(1.1, 300.0)
//    user.
    println(user.intrestRate)
    println(user.balance)

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
    var topSpeed: Int
        get() = 10
        set(value){
            model = "Unknown"
        }
}

class MyCarBag2(var model: String, var topSpeed: Int){

    init {
        println("Car $model with top speed of $topSpeed km/h has been created.")
    }

    fun getModel(){
        println("The model is $model")
    }

    fun start(){
        println("The car is starting")
    }

    fun drive(speed: Int){
        println("Driving at $speed km/h")
    }
}

class User{
    var intrestRate = 0.0
    var balance = 0.0
        get() = field
        public set(value){
            if (value < 10)
                intrestRate = 0.5
            else if (value < 1000)
                intrestRate = 1.0
            else if (value > 10000)
                intrestRate = 0.2
            field = value
        }

    constructor(intrestRate: Double, balance: Double){
        this.intrestRate += intrestRate
        this.balance = balance

        println("User with balance $balance and intrest rate $intrestRate has been created.")
    }

    init {
        intrestRate = 200.0
        println("New user created.")
    }
}