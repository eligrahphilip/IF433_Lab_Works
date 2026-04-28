package oop_00000138865_EligrahPhilipMapaKogoya.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 3.2))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.5))
    txRepo.add(Transaction("TX003", 75.0))
}
