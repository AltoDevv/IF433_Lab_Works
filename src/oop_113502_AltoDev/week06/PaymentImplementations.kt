package oop_113502_AltoDev.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("processing rp$amount via gopay server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double) {
        println("contacting bank for rp$amount")
    }
}