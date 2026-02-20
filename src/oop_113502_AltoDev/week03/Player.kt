package oop_113502_AltoDev.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXP(amount: Int) {
        if (amount <= 0) {
            println("XP harus positif")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        println("$username mendapatkan $amount XP.")

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }

    fun showStatus() {
        println("Username: $username")
        println("XP: $xp")
        println("Level: $level")
    }
}