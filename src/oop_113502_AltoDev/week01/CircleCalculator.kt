package oop_113502_AltoDev.week01

fun main(args: Array<string>){
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius
    println("Radius: $radius Area: $area")

    checkSize(area)
}
fun checkSize(area: Double) {
    if(area>100) {
        println("this is a big circle")
    }else {
        println("this is a small circle")
    }
}