package oop_00000138865_EligrahPhilipMapaKogoya.week01

fun calculateStatus(score: Int?) =
    if ((score ?: 0) >= 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "Eligrah"
    val score: Int? = 78
    println("$name ${calculateStatus(score)}")
}
