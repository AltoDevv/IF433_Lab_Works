package oop_113502_AltoDev.week03

fun main() {

    val w1 = Weapon("Excalibur")

    w1.damage = -50
    w1.damage = 1200
    w1.damage = 900

    println("Nama: ${w1.name}")
    println("Damage: ${w1.damage}")
    println("Tier: ${w1.tier}")
}