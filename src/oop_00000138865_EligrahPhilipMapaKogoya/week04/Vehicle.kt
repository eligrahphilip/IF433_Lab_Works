package oop_00000138865_EligrahPhilipMapaKogoya.week04

// Gunakan keyword 'open' agar class bisa diwariskan
open class Vehicle(val brand: String) {
    
    // Method juga bersifat final secara default. Gunakan 'open' agar bisa di-override.
    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
    
    open fun honk() {
        println("$brand berbunyi: Beep! Beep!")
    }
}
