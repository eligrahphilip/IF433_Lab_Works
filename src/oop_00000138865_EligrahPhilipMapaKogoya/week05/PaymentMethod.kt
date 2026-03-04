package oop_00000138865_EligrahPhilipMapaKogoya.week05

// Abstract class untuk sistem pembayaran
abstract class PaymentMethod(val accountName: String) {
    
    // Abstract function yang wajib di-override oleh child class
    abstract fun processPayment(amount: Double)
}
