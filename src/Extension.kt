fun main(args: Array<String>){
    var name = "Ugochukwu"
    println(name.slim())
    println(name.slim().betterLength)

    var list = arrayListOf(1,2,3)
    println(list.message())

}

fun String.slim(): String = this.substring(1, length-1)

val String.betterLength: Int
    get() = this.length + 1

fun ArrayList<Int>.message(): String {
    return "This is an array list of size $size"
}