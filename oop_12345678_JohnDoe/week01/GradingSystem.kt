package oop_12345678_JohnDoe.week01

fun main() {
    val studentName = "Alice"
    val score: Int? = 85
    
    val grade = when {
        score == null -> "N/A"
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "E"
    }
    
    val status = if (score != null && score >= 60) "Lulus" else "Tidak Lulus"
    
    println("Nama: $studentName")
    println("Nilai: ${score ?: "Tidak ada nilai"}")
    println("Grade: $grade")
    println("Status: $status")
    
    val bonus = score?.let { it + 5 } ?: 0
    println("Nilai dengan bonus: $bonus")
}
