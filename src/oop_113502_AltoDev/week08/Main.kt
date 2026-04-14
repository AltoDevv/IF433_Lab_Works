package oop_113502_AltoDev.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "kota tidak diketahui"
    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null,250000)

    val receipt = validOrder.totalPrice?.let { price->
        val tax = price *0.11
        "transaksi valid. harga : rp$price, pajak : rp$tax"
    } ?: "transaksi invalid : harga belum di set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "smartphone",
        1500000,
        UserProfile("andi",null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData){
        val text = item as? String
        text?.let{
            println("ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "unknown string"
    println("hasil cast + fallback: $safeString")
}