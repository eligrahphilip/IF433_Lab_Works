package oop_00000138865_EligrahPhilipMapaKogoya.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 3.2))
    coinRepo.add(Coin("USDT", 1000.0))
}
