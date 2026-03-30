package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 17: (task) implement exhaustive processEvent
fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Bertemu monster: ${event.monsterName}! Bersiap tempur!")
        is BattleState.LootDropped -> println("Item jatuh: ${event.item.name} (${event.item.rarity}, drop chance: ${event.item.rarity.dropChance}%)")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di Safe Zone. Aman!")
    }
}
