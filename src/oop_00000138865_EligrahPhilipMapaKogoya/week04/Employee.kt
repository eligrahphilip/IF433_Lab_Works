package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Parent class untuk hierarki karyawan
open class Employee(val name: String, val baseSalary: Int) {
    
    open fun work() {
        println("$name sedang bekerja.")
    }
    
    open fun calculateBonus(): Int {
        return baseSalary * 10 / 100
    }
}
