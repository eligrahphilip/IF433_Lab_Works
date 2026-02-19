package oop_00000138865_EligrahPhilipMapaKogoya.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
    
    // Hanya bisa diakses di file/class ini saja
    private var performanceRating: Int = 3
    
    fun increasePerformance() {
        if (performanceRating < 5) {
            performanceRating++
            println("Kinerja $name meningkat! Rating: $performanceRating")
        } else {
            println("Rating sudah maksimal!")
        }
    }
    
    // Kita tidak buat getter untuk performanceRating, jadi data ini benar-benar rahasia
    // Kecuali kita buat function khusus untuk print.
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
