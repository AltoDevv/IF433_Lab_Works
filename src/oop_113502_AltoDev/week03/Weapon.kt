package oop_113502_AltoDev.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("gabis negatif")
            } else if (value > 1000) {
                println("gaboleh gede gede maks 1000")
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}