package oop_113502_AltoDev.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BNBUSDT", "LONG",  30,  12.4,  "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 12,  -3.8,  "CLOSED"),
        TradeLog("ADAUSDT", "LONG",  18,  7.6,   "OPEN"),
        TradeLog("DOGEUSDT", "SHORT", 25, -9.1,  "CLOSED"),
        TradeLog("AVAXUSDT", "LONG",  10,  5.3,  "OPEN"),
        TradeLog("MATICUSDT", "SHORT", 8,  2.2,  "CLOSED"),
        TradeLog("DOTUSDT", "LONG",   14, -4.7,  "CLOSED")
    ).shuffled()

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0}
}