fun main (args: Array<String>){

    if(DatabaseAccess.connected)
        DatabaseAccess.disconnect()
    else
        DatabaseAccess.connect()

    println("Database connected: ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    val host = "localhost"
    val port = 5432
    var connected: Boolean = true

    fun connect() {
        println("Connecting to database at $host:$port")
        connected = true
    }

    fun disconnect() {
        println("Disconnecting from database")
        connected = false
    }
}