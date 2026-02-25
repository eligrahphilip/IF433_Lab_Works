package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    
    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}
