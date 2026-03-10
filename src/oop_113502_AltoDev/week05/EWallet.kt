package oop_113502_AltoDev.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double): Double {

        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar $amount. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }

    }

    fun topup(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}