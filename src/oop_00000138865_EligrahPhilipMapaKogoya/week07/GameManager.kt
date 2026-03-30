package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 12: (task) create GameManager singleton
object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}
