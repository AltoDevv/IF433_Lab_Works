package oop_113502_AltoDev.week04

open class Vechile (val brand:String){
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. kecepatan: $speed km/jam")
    }
    open fun honk(){
        println("Beep beep")
    }
}