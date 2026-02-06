package oop_113502_AltoDev.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }

fun main(){
    val gameTitle = "aDev 2026"
    val price = 750000
}