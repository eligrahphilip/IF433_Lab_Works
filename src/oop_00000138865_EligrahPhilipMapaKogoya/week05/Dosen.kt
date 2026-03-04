package oop_00000138865_EligrahPhilipMapaKogoya.week05

// WAJIB di-override karena fungsi bekerja() bersifat abstract di Parent
class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }
    
    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}
