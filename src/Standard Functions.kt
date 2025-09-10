fun main (args: Array<String>) {
    val animals: List<String> = listOf("dog", "cat", "elephant", "tiger", "lion", "rat", "girrafe")
    animals.map { it.length }
        .filter { it > 3 }
        .let{
            println(it)
            println("Total items: ${it.size}")
        }
}