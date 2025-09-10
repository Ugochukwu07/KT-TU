import kotlin.random.Random

fun main(args: Array<String>){

    val key = Lock.createKey()
    val lock = Lock(key)

    println("Lock opened: ${lock.openLock(key)}")

    val randomKey = Lock.createKey()
    println("Lock opened with random key: ${lock.openLock(randomKey)}")

}

class Key {
    var secretKey: String? = null
        set(value) {
            if(field != null) {
                println("Key already has a value")
                return
            }
            println("New Key is: $value")
            field = value
        }

    init {
        this.secretKey = Random(System.currentTimeMillis()).nextInt().toString()
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