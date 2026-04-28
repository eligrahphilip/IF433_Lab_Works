package oop_00000138865_EligrahPhilipMapaKogoya.week10

// MathBox menggunakan upper bound <T : Number> agar hanya tipe angka yang diizinkan
class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}
