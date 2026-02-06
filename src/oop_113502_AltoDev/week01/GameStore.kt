package oop_113502_AltoDev.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000){
        price - (price * 20 / 100)
    }else {
        price - (price * 10 / 100)
    }

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note : String
){
    println("===== SteamKW Digital Receipt =====")
    println("Judul Game : $title")
    println("Harga Asli : RP $originalPrice")
    println("Harga Akhir : RP $finalPrice")
    println("Catatan : $note")
}
fun main(){
    val gameTitle ="aDev 2026"
    val price = 750000

    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    val noteToPrint = userNote ?: "tidak ada catatan"

    printReceipt(gameTitle, price, finalPrice, noteToPrint)
}