package oop_00000138865_EligrahPhilipMapaKogoya.week09

// Data class sederhana untuk latihan chaining
data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )

    println("=== HONOR STUDENTS PIPELINE ===")

    // Pipeline chaining tanpa for-loop dan tanpa if manual:
    // 1. filter  → buang yang GPA < 3.5
    // 2. sortedBy → urutkan berdasarkan nama
    // 3. map     → ambil namanya saja & jadikan kapital
    val honorNames = students
        .filter { it.gpa >= 3.5 }       // 1. Buang yang GPA < 3.5
        .sortedBy { it.name }            // 2. Urutkan berdasarkan nama
        .map { it.name.uppercase() }     // 3. Ambil namanya saja & jadikan kapital

    honorNames.forEach { println("Honor Roll: $it") }
}
