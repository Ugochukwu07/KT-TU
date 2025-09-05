fun main (args: Array<String>) {

    var count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    var count2 = mapOf<Int, String>()
    var values = count.values
    println(values::class.java)

    var colors15 = hashSetOf<String>()
    colors15.add("red")
    colors15.add("blue")
    colors15.add("green")
    println(colors15)
    colors15.remove("red")
    println(colors15)

    //SETS
    val numbers = setOf(47,83,9,17, 282,0,9,28,8,27,47)
    println(numbers)
//    println(numbers.size)
//    println(numbers.contains(9))

    val numbers2 = setOf<Int>()
    println(numbers2)

    val number3 = setOf<Int?>(null, 1, 2, 3, null)
    println(number3)




    //ARRAY LIST FUNCTIONS
    var colors8 = arrayListOf("green", "red", "blue", "indigo", "violet")
    colors8.set(1, "black")
    println(colors8)
    colors8[0] = "white"
    println(colors8)

    val subColors = colors8.subList(0, 3)
    println(subColors)
    println(subColors::class.java)
    colors8.clear()
    println(colors8)
    println(colors8.isEmpty())

    //List Functions
    val colors10 = listOf("green", "red", "blue", "green", "blue", "indigo", "violet")
    println(colors10)
    println(colors10.size)
    println(colors10.contains("red"))
    println(colors10.contains("yellow"))
    println(colors10.indexOf("blue"))

    val color7 = listOf("green", "black", "blue", "green")
    println(colors10.containsAll(color7))

    //Practice
    val items = arrayListOf<String>("laptop", "phone", "tablet", "mouse", "keyboard", "mug")
    val removedItems = listOf<String>("mug", "mouse")

    items.removeAll(removedItems)
    println(items)

    //Array List<Type>
    val colors1 = arrayListOf("green", "red", "blue", "indigo", "violet")
    println(colors1)
    colors1.add("yellow")
    println(colors1)
    colors1.remove("red")
    colors1.removeAt(1)
    println(colors1)

    val color5 = arrayListOf<String>()
    println(color5)

    var moreColors = arrayListOf("pink", "blue", "sky blue")

    colors1.addAll(moreColors)
    println(colors1)

    colors1.removeAll(moreColors)
    println(colors1)

    val colors = listOf("green", "red", "blue")
    println(colors)
    println(colors[0])
    println(colors[1])
//    println(colors[5]) // IndexOutOfBoundsException

    val colors2 = listOf<String>()
    println(colors)

    val colors3 = listOf("green", "red", "blue", "blue")
    println(colors3)
    println(colors.get(1))
    println(colors3.size)

    var color4 = listOf("green", "red", "blue", null, null)
    println(color4)

}