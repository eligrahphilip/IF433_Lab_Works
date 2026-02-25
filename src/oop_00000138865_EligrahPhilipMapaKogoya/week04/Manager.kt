package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Manager mewarisi Employee
class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }
    
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}
