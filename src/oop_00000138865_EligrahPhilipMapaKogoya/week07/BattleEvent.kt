package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 16: (task) create BattleState sealed class hierarchy
sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}
