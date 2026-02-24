package oop_113502_AltoDev.week04

fun main(){
    println("--- Testing Vechile ---")
    val generalVechile = Vechile("Sepeda onthel")
    generalVechile.honk()
    generalVechile.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}