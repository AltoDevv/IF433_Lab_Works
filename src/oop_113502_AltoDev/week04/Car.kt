package oop_113502_AltoDev.week04

open class Car(brand: String, val numberOfDoors: Int):Vechile(brand) {
    fun openTrunk(){
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk(){
        println("Tin Tin mobil$brand lewat")
    }

    override fun accelerate() {
        super.accelerate()
        println("mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}