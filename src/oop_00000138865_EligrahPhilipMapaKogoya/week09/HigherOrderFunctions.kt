package oop_00000138865_EligrahPhilipMapaKogoya.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")

    // === HOF: FILTER ===
    println("\n=== HOF: FILTER ===")
    // filter() membuat list baru berisi elemen yang memenuhi kondisi (true)
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    // === HOF: MAP ===
    println("\n=== HOF: MAP ===")
    // map() merubah bentuk/nilai data, tapi ukurannya tetap sama
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    // === HOF: SORTED ===
    println("\n=== HOF: SORTED ===")
    val scores = listOf(72, 95, 60, 88, 45)
    val ascending  = scores.sortedBy { it }
    val descending = scores.sortedByDescending { it }
    println("Ascending:  $ascending")
    println("Descending: $descending")

    // === HOF: FOREACH ===
    println("\n=== HOF: FOREACH ===")
    // forEach() mengiterasi setiap elemen tanpa membuat list baru
    descending.forEach { println("Score: $it") }
}
