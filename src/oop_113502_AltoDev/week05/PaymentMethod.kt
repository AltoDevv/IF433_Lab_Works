package oop_113502_AltoDev.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double): Double
}