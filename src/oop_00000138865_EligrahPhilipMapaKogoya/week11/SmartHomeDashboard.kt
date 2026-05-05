package oop_00000138865_EligrahPhilipMapaKogoya.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Pencahayaan: apply untuk setup, also untuk tambah ke list
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Konfigurasi Keamanan: apply untuk ubah properti, also untuk log dan tambah ke list
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC & Kabel: run untuk membuat dan mengembalikan perangkat baru
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)

    // Alat pakan peliharaan
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // Format Summary dengan with
    with(homeDevices) {
        println("\n=== RINGKASAN SMART HOME ===")
        println("Total perangkat terdaftar: ${this.size}")
    }

    // Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total daya terpakai: $totalPower Watt")

    // Eksekusi Dashboard: iterasi semua perangkat dan cetak diagnosa
    println("\n=== DASHBOARD DIAGNOSTIK ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}
