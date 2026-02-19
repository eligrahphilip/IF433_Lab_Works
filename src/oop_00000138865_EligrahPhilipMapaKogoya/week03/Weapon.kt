package oop_00000138865_EligrahPhilipMapaKogoya.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    println("WARNING: Damage terlalu tinggi! Di-set ke 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }
    
    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}
