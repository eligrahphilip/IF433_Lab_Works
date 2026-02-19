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
    
    private var performanceRating: Int = 3
    
    fun increasePerformance() {
        if (performanceRating < 5) {
            performanceRating++
            println("Kinerja $name meningkat! Rating: $performanceRating")
        } else {
            println("Rating sudah maksimal!")
        }
    }
    
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
    
    val bonus: Int
        get() {
            return when {
                performanceRating >= 4 -> salary * 20 / 100
                performanceRating >= 3 -> salary * 10 / 100
                else -> 0
            }
        }
}
