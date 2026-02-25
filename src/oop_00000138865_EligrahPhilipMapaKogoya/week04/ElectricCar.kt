package oop_00000138865_EligrahPhilipMapaKogoya.week04

// ElectricCar mewarisi Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    
    // Keyword 'final' mencegah class keturunan ElectricCar kelak tidak bisa mengubah cara kerjanya
    final override fun accelerate() {
        // Dalam kasus ini, jangan panggil super.accelerate()
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}
