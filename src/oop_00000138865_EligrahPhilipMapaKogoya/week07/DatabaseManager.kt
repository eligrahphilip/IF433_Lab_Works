package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 1: create singleton DatabaseManager
object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}
