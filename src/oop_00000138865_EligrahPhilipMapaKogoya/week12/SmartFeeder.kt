package oop_00000138865_EligrahPhilipMapaKogoya.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    // Jadwal Makan 1: simulasi pagi dengan multiple catch
    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    // Jadwal Makan 2: simulasi sore dengan runCatching
    println("\n=== JADWAL MAKAN SORE ===")
    val eveningResult = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}
