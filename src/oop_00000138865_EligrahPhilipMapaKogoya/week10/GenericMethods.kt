package oop_00000138865_EligrahPhilipMapaKogoya.week10

// Fungsi generic: <T> sebelum nama fungsi agar bisa menerima tipe apapun
fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

// Fungsi generic dengan tipe kembalian yang sama dengan parameternya
fun <T> processData(input: T): T {
    return input
}

// Fungsi dengan where clause: T harus Comparable agar bisa dibandingkan
fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}
