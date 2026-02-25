package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    
    override fun honk() {
        println("$brand berbunyi: Honk! Honk!")
    }
    
    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("$brand melaju dengan $numberOfDoors pintu.")
    }
    
    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}
