package oop_00000138865_EligrahPhilipMapaKogoya.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    
    var usedAmount: Double = 0.0
    
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("✅ Pembayaran Rp $amount berhasil menggunakan Credit Card ($accountName).")
            println("   Limit terpakai: Rp $usedAmount / Rp $limit")
        } else {
            println("❌ Transaksi ditolak! Limit tidak mencukupi.")
            println("   Limit tersisa: Rp ${limit - usedAmount}, dibutuhkan: Rp $amount")
        }
    }
}
