fun main(args: Array<String>) {

    var table: String? = null
    println(table!!.length)

    var catName: String? = null
    catName = "Fluffy"
    println(catName?:"This cat has no name")

    println("Enter a number:")
    var userInput = readLine()
    var multi = userInput?.toDouble()?.times(7)
    println(multi?.toString())


    var cow: String? = "Fluffy The Cow and Friends"
    println(cow?.substring(3,7))

    var a: Int? = 10

    println(a)
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))

    var herName: String = "Sally"
    var hisName: String? = null

    println(herName)
    println(hisName)

//    herName: String? = null

//    println(herName)
}