package oop_00000138865_EligrahPhilipMapaKogoya.week08

fun main() {

    // =========================================================
    // B. LATIHAN 1: Nullable & Smart Casting
    // =========================================================
    println("========== LATIHAN 1: Nullable & Smart Casting ==========")

    val users = listOf(
        UserProfile("U01", "Alice", "alice@mail.com", "+6281111111"),
        UserProfile("U02", "Bob",   null,             "+6282222222"),
        UserProfile("U03", "Carol", "carol@mail.com", null),
        UserProfile("U04", "Dave",  null,             null)
    )

    val notifService = NotificationService()
    users.forEach { notifService.sendNotification(it) }

    // =========================================================
    // C. LATIHAN 2: Safe Call, Elvis, let
    // =========================================================
    println("\n========== LATIHAN 2: Safe Call, Elvis, let ==========")

    val order = Order(
        orderId = "ORD-001",
        customer = Customer(
            name = "Alice",
            address = Address(city = "Bandung")
        )
    )
    val emptyOrder = Order(orderId = "ORD-002", customer = null)

    // Checkpoint 4: chained safe calls + Elvis
    val city1 = order?.customer?.address?.city ?: "Unknown City"
    val city2 = emptyOrder?.customer?.address?.city ?: "Unknown City"
    println("City order 1: $city1")
    println("City order 2: $city2")

    // Checkpoint 5: safe call dengan let
    order.customer?.let { customer ->
        println("Customer ditemukan: ${customer.name}, kota: ${customer.address?.city ?: "Unknown"}")
    }
    emptyOrder.customer?.let {
        println("Ini tidak akan tercetak")
    } ?: println("Order 2 tidak memiliki customer")

    // =========================================================
    // D. LATIHAN 3: Safe Casting (as?)
    // =========================================================
    println("\n========== LATIHAN 3: Safe Casting (as?) ==========")

    // Checkpoint 6: mixed list
    val items: List<Any> = listOf("Hello", 123, true, "World", 45.5, "Kotlin")

    // Checkpoint 7: filter hanya String via as?
    println("-- Hanya String --")
    for (item in items) {
        val str = item as? String
        str?.let { println("  String: $it") }
    }

    // Checkpoint 8: fallback dengan as? dan Elvis
    println("-- Dengan fallback Default --")
    for (item in items) {
        val value = item as? String ?: "Default"
        println("  $value")
    }

    // =========================================================
    // E. LATIHAN 4: !! dan requireNotNull
    // =========================================================
    val parser = ApiParser()
    parser.demonstrateRequireNotNull()

    // Checkpoint 14: simulasi unit test
    runMockUnitTest()

    // =========================================================
    // F. TUGAS MANDIRI: E-Commerce Pipeline
    // =========================================================
    println("\n========== TUGAS MANDIRI: E-Commerce Pipeline ==========")
    runEcommercePipeline(parser)
}

fun runEcommercePipeline(parser: ApiParser) {
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

            // ?.let: hanya dieksekusi jika product tidak null
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
