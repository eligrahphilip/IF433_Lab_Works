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
}
