package oop_00000138865_EligrahPhilipMapaKogoya.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    
    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    
    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()
        
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.mengelolaData()
            }
        }
        println("------------------------")
    }
    
    println("\n=== TEST OVERLOADING (MathHelper) ===")
    val math = MathHelper()
    
    val luasPersegi = math.hitungLuas(5)
    println("Luas persegi (sisi 5): $luasPersegi")
    
    val luasPersegiPanjang = math.hitungLuas(10, 5)
    println("Luas persegi panjang (10 x 5): $luasPersegiPanjang")
    
    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas lingkaran (jari-jari 7.0): $luasLingkaran")
    
    println("\n=== SISTEM PEMBAYARAN (Polymorphism) ===")
    val wallet = EWallet(accountName = "GoPay - Eligrah", balance = 50000.0)
    val creditCard = CreditCard(accountName = "BCA Visa", limit = 100000.0)
    
    // Polymorphic Collection
    val paymentMethods: List<PaymentMethod> = listOf(wallet, creditCard)
    
    for (method in paymentMethods) {
        println("\n--- Mencoba pembayaran Rp 75000.0 ---")
        method.processPayment(75000.0)
        
        // Smart Casting Challenge: Jika metode pembayaran adalah EWallet, coba top-up dan bayar lagi
        when (method) {
            is EWallet -> {
                println("\n🔍 Terdeteksi sebagai EWallet! Melakukan top-up otomatis...")
                method.topUp(50000.0)
                println("--- Mencoba pembayaran Rp 75000.0 lagi setelah top-up ---")
                method.processPayment(75000.0)
            }
        }
    }
}
