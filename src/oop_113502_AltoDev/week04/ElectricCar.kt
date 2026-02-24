package oop_113502_AltoDev.week04

class ElectricCar(brand:String, numberOfDoors:Int,val batteryCapacity:Int):Car(brand,numberOfDoors) {
    final override fun accelerate(){
        println("$brand berakselerasi dalam hening kapasitas baterai $batteryCapacity%")
    }
}