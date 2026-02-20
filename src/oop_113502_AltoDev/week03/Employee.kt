package oop_113502_AltoDev.week03

import kotlin.times

class Employee(val name:String){
    var salary: Int = 0

    set(value) {
        if (value < 0) {
            println("gaji gaboleh mines")
            field = 0
        }else {
            field = value
        }
    }

    private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary *0.1

}

fun main(){
    val e = Employee("Budi")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar ${e.tax}")
}