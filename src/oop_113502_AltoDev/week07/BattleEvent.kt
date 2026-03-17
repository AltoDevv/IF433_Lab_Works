package oop_113502_AltoDev.week07

sealed class BattleEvent {
    data class MonsterEncounter(val monsterName: String) : BattleEvent()
    data class LootDropped(val item: GameItem): BattleEvent()
    data class GameOver(val reason: String): BattleEvent()
    object SafeZone : BattleEvent()
}