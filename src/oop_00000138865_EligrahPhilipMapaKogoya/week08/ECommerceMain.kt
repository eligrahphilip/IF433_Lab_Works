package oop_00000138865_EligrahPhilipMapaKogoya.week08

// Entry point khusus untuk tugas mandiri e-commerce saja
fun mainEcommerce() {
    val parser = ApiParser()

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop",     "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt",    "type" to "CLOTHING",   "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse",      "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf(               "name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown",    "type" to "FOOD")
    )

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                when (it) {
                    is Electronic -> println("Product: ${it.name} → Warranty ${it.warrantyMonths} bulan")
                    is Clothing   -> println("Product: ${it.name} → Size ${it.size}")
                }
                parser.checkout(it)
            } ?: println("Product type '${raw["type"]}' tidak dikenali → di-skip")
        } catch (e: IllegalArgumentException) {
            println("[ERROR] ${e.message}")
        }
    }
}
