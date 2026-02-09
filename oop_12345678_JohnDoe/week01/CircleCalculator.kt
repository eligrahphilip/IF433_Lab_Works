package oop_12345678_JohnDoe.week01

fun main() {
    val radius = 7.0
    val area = calculateArea(radius)
    val circumference = calculateCircumference(radius)
    
    println("Radius: $radius")
    println("Area: $area")
    println("Circumference: $circumference")
    println("Size: ${checkSize(radius)}")
}

fun calculateArea(radius: Double) = Math.PI * radius * radius

fun calculateCircumference(radius: Double) = 2 * Math.PI * radius

fun checkSize(radius: Double) = when {
    radius > 10 -> "Large"
    radius > 5 -> "Medium"
    else -> "Small"
}
