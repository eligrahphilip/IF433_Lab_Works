package oop_00000138865_EligrahPhilipMapaKogoya.week09

/**
 * Domain model untuk satu log transaksi trading crypto futures.
 *
 * @param pair     Pasangan koin, misal "BTCUSDT"
 * @param position Arah posisi: "LONG" atau "SHORT"
 * @param leverage Besaran leverage yang digunakan
 * @param roe      Return on Equity dalam persen (positif = profit, negatif = loss)
 * @param status   Status transaksi: "OPEN" atau "CLOSED"
 */
data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)
