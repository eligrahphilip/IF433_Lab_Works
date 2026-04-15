package oop_00000138865_EligrahPhilipMapaKogoya.week08

class ApiParser {

    // Latihan 4: requireNotNull sebagai alternatif aman dari !!
    fun demonstrateRequireNotNull() {
        println("\n=== [Latihan 4] requireNotNull ===")

        // Checkpoint 10: simulasi crash dengan !! (dikomentari agar tidak crash saat run)
        // val text: String? = null
        // println(text!!)  // → NullPointerException

        // Checkpoint 11: ganti dengan requireNotNull
        val text: String? = null
        try {
            requireNotNull(text) { "Text tidak boleh null" }
        } catch (e: IllegalArgumentException) {
            println("[requireNotNull] Exception tertangkap: ${e.message}")
        }

        // Checkpoint 12 & 13: Java interop dengan !!
        val result = LegacyJavaAPI.getData()!!
        println("[Java Interop] $result")
    }

    // Tugas Mandiri: parse product dari raw JSON map
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id   = requireNotNull(rawJson["id"]   as? String) { "Field 'id' tidak boleh null" }
        val name = requireNotNull(rawJson["name"] as? String) { "Field 'name' tidak boleh null" }
        val type = rawJson["type"] as? String ?: return null

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id = id, name = name, warrantyMonths = warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id = id, name = name, size = size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing   -> product.id
        }

        // !! digunakan khusus untuk Java interop
        val transactionId = JavaPaymentService.processPayment(productId)!!
        println("  Transaction ID: $transactionId")
    }
}
