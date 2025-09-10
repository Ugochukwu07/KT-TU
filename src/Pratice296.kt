import kotlin.random.Random

fun main(args: Array<String>){

    val key = Lock.createKey()
    val lock = Lock(key)

    println("Lock opened: ${lock.openLock(key)}")

}

class Key {
    var secretKey: String? = null
        set(value) {
            println("New Key is: $value")
            field = value
        }

    init {
        this.secretKey = Random.nextInt(20000, 2000000).toString()
    }
}

class Lock {
    var secretKey: String? = null

    constructor(key: Key) {
        this.secretKey = key.secretKey
        println("Lock created with key: ${this.secretKey}")
    }

    companion object {
        fun createKey(): Key {
            return Key()
        }
    }

    fun openLock(key: Key): Boolean {
        return this.secretKey == key.secretKey
    }
}