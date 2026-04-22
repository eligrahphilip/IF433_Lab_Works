package oop_00000138865_EligrahPhilipMapaKogoya.week09

fun main() {
    // === TEST LIST ===
    println("=== TEST LIST ===")

    // Immutable List: tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")

    // Mutable List: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    // === TEST SET ===
    println("\n=== TEST SET ===")

    // Set otomatis membuang duplikat
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada
    println("Active Users: $activeUsers")

    // === TEST MAP ===
    println("\n=== TEST MAP ===")

    // Map: key unik, value boleh duplikat
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20  // Menambah data baru
    inventory["Apples"] = 45   // Mengupdate data lama
    println("Inventory: $inventory")
}
