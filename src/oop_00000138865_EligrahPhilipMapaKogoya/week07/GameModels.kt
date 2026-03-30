package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 13: (task) create ItemRarity enum
enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(40),
    RARE(20),
    EPIC(5),
    LEGENDARY(1)
}

// CHECKPOINT 14: (task) create GameItem data class
data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)
