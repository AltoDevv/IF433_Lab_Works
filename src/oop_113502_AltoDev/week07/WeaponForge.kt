package oop_113502_AltoDev.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang Kayu Bapuk",5, ItemRarity.COMMON)
            return Weapon(item,50)
        }

        fun forgeEpicSword(): Weapon{
            val item = GameItem("Pedang Besi Bagus",50, ItemRarity.EPIC)
            return Weapon(item,150)
        }
    }
}