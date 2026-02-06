package oop_113502_AltoDev.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String
) {
    println("===== SteamKW Digital Receipt =====")
    println("Judul Game   : $title")
    println("Harga Asli   : Rp $originalPrice")
    println("Harga Akhir  : Rp $finalPrice")
    println("Catatan      : $note")
}


fun main() {

    val gameTitle = "Cyberpunk 2077"
    val price = 750000

    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    val noteToPrint = userNote ?: "Tidak ada catatan"

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = noteToPrint
    )

}

