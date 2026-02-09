package oop_12345678_JohnDoe.week01

fun main() {
    val gameName = "Elden Ring"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    
    printReceipt(
        gameName = gameName,
        originalPrice = price,
        discount = discount,
        finalPrice = finalPrice,
        userNote = "Terima kasih sudah berbelanja!"
    )
    
    println()
    
    val gameName2 = "Stardew Valley"
    val price2 = 400000
    val discount2 = calculateDiscount(price2)
    val finalPrice2 = price2 - discount2
    
    printReceipt(
        gameName = gameName2,
        originalPrice = price2,
        discount = discount2,
        finalPrice = finalPrice2,
        userNote = null
    )
}

fun calculateDiscount(price: Int): Int = when {
    price > 500000 -> (price * 0.20).toInt()
    else -> (price * 0.10).toInt()
}

fun printReceipt(
    gameName: String,
    originalPrice: Int,
    discount: Int,
    finalPrice: Int,
    userNote: String? = null
) {
    println("=== GAME STORE RECEIPT ===")
    println("Game: $gameName")
    println("Harga Asli: Rp $originalPrice")
    println("Diskon: Rp $discount")
    println("Harga Final: Rp $finalPrice")
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
    println("==========================")
}
