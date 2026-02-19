package oop_00000138865_EligrahPhilipMapaKogoya.week03

fun main() {
    val e = Employee("Budi")
    
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    
    e.increasePerformance()
    
    println("Bonus yang harus dibayar: ${e.bonus}")
}
