package oop_00000138865_EligrahPhilipMapaKogoya.week09

fun main() {
    println("=== TEST LAMBDA ===")

    // Lambda eksplisit: parameter ditulis secara eksplisit { a: Int, b: Int -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lambda dengan satu parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")

    // Lambda disimpan sebagai variabel dan dipanggil langsung
    val greet: (String) -> String = { "Hello, $it!" }
    println(greet("Eligrah"))

    // Lambda multi-line: baris terakhir adalah return value
    val classify: (Int) -> String = {
        when {
            it > 0  -> "Positive"
            it < 0  -> "Negative"
            else    -> "Zero"
        }
    }
    println("Classify 7: ${classify(7)}")
    println("Classify -3: ${classify(-3)}")
}
