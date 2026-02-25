package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Developer mewarisi Employee
class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
    
    // Biarkan calculateBonus() sesuai bawaan dari Parent (tidak perlu di-override)
}
