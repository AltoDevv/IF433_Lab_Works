package oop_113502_AltoDev.week07

fun processEvent(event: BattleEvent){
    when(event){
        is BattleEvent.MonsterEncounter -> {
            println("MUNCUL MONSTER : ${event.monsterName}")
        }

        is BattleEvent.LootDropped -> {
            val item = event.item
            println("Nama Item : ${item.name}")
            println("Damage Item : ${item.damage}")
            println("Rarity Item : ${item.rarity}")
        }

        is BattleEvent.GameOver -> {
            println("Game Over : ${event.reason}")
        }

        BattleEvent.SafeZone ->{
            println("Safe Zone")
        }
    }
}