// CHECKPOINT 7: create Camera and Phone interfaces with default methods
interface Camera {
    fun turnOn() { println("Lensa kamera terbuka dan sensor aktif.") }
}

interface Phone {
    fun turnOn() { println("Sinyal seluler mencari jaringan.") }
}
