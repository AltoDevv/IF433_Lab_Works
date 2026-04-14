package oop_113502_AltoDev.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "kota tidak diketahui"
    println("Tujuan pengiriman : $destination")
}