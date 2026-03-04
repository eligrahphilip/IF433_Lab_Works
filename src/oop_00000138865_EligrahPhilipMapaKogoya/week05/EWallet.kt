package oop_00000138865_EligrahPhilipMapaKogoya.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("✅ Pembayaran Rp $amount berhasil menggunakan EWallet ($accountName).")
            println("   Sisa saldo: Rp $balance")
        } else {
            println("❌ Saldo tidak cukup! Saldo Anda: Rp $balance, dibutuhkan: Rp $amount")
        }
    }
    
    fun topUp(amount: Double) {
        balance += amount
        println("💰 Top-up Rp $amount berhasil! Saldo sekarang: Rp $balance")
    }
}
