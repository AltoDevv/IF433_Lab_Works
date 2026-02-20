package oop_113502_AltoDev.week02

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    println("Mmasukkan base damage hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName,heroDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Serang")
        println("2. Kabur")

        val choice = scanner.nextInt()

        if (choice == 1) {
            enemyHp -= hero.baseDamage
            println("HP MUSUH : $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Hp HERO : ${hero.hp}")
            }
        } else {
            println("KABUR")
            break
        }
    }
}