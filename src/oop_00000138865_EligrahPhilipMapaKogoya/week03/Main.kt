package oop_00000138865_EligrahPhilipMapaKogoya.week03

fun main() {
    val e = Employee("Budi")
    
    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")
}
