package oop_113502_AltoDev.week05

class CreditCard(accountName: String, var limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil bayar dengan kartu kredit: $amount")
        } else {
            println("Transaksi ditolak. Melebihi limit.")
        }

    }

}