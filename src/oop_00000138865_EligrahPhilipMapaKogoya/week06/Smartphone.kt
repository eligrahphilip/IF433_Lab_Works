// CHECKPOINT 8: (trial) trigger the diamond problem compiler error
// class Smartphone : Camera, Phone {
// }

// CHECKPOINT 9: fix diamond problem using explicit super delegation
class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
