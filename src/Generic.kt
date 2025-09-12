fun main(args: Array<String>){
    var box = Box<String>("Hello")
    box.display("World")
    println(box.value)
}

class Box<T>(t: T){
    var value = t

    fun display(item: T){
        println("The item is $item")
    }
}