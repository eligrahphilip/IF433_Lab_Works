package oop_00000138865_EligrahPhilipMapaKogoya.week09

fun main() {

    // ── Data uji: minimal 6 trade, campuran OPEN/CLOSED, profit/loss, ≥2 pair ──
    val tradeHistory = listOf(
        TradeLog("BTCUSDT",  "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("ETHUSDT",  "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("BTCUSDT",  "SHORT",  5,  -12.0, "CLOSED"),
        TradeLog("SOLUSDT",  "LONG",  15,  22.8,  "CLOSED"),
        TradeLog("ETHUSDT",  "LONG",  10,   8.3,  "CLOSED"),
        TradeLog("SOLUSDT",  "SHORT", 25,  -3.7,  "CLOSED"),
        TradeLog("BTCUSDT",  "LONG",  10,   5.0,  "OPEN"),   // OPEN → tidak masuk pipeline
        TradeLog("ETHUSDT",  "SHORT",  5,  -1.5,  "OPEN")    // OPEN → tidak masuk pipeline
    )

    // ── Pipeline 1: Filter hanya CLOSED ──────────────────────────────────────
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // ── Pipeline 2: Winning trades (roe > 0) ─────────────────────────────────
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // ── Pipeline 3: Losing trades (roe <= 0) ─────────────────────────────────
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // ── Pipeline 4: Top performers — sortedByDescending + map ke String ──────
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // ── Pipeline 5: Worst performers — sortedBy + map ke String ──────────────
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // ── Pipeline 6: Unique pairs dari seluruh history (map + toSet) ──────────
    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    // ── Dashboard Output ──────────────────────────────────────────────────────
    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS (WIN) ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS (LOSS) ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- UNIQUE TRADING PAIRS ---")
    println(uniquePairs)
}
