package oop_113502_AltoDev.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("ETH",0.25))
    coinRepo.add(Coin("BTC",3.40))
    coinRepo.add(Coin("SLA",510.00))

    val response = ApiResponse("200 ok", coinRepo.getAll())

    println("\nStatus Respons: ${response.status}")
    println("\n--- DAFTAR KOIN ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TRX-001", 250000.0))
    txRepo.add(Transaction("TRX-002", -50000.0))
    txRepo.add(Transaction("TRX-003", 100000.0))

    println("\n--- DAFTAR TRANSAKSI ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}