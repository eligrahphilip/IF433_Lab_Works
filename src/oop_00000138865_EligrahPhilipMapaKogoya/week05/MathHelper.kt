package oop_00000138865_EligrahPhilipMapaKogoya.week05

class MathHelper {
    
    // Overloading: Nama sama, parameter berbeda
    
    // Untuk menghitung luas persegi (sisi * sisi)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }
    
    // Untuk menghitung luas persegi panjang (panjang * lebar)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }
    
    // Untuk menghitung luas lingkaran (3.14 * jariJari * jariJari)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}
