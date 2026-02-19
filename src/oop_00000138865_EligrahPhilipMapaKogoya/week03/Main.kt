package oop_00000138865_EligrahPhilipMapaKogoya.week03

fun main() {
    println("=== TEST EMPLOYEE ===")
    val e = Employee("Budi")
    
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    
    e.increasePerformance()
    
    println("Bonus yang harus dibayar: ${e.bonus}")
    
    println("\n=== TEST WEAPON ===")
    val weapon = Weapon("Excalibur")
    
    println("Weapon: ${weapon.name}")
    weapon.damage = -50
    println("Damage setelah set -50: ${weapon.damage}")
    
    weapon.damage = 9999
    println("Damage setelah set 9999: ${weapon.damage}")
    
    println("Tier: ${weapon.tier}")
    
    println("\n=== TEST PLAYER ===")
    val player = Player("Eligrah")
    
    println("Player: ${player.username}")
    println("Level awal: ${player.level}")
    
    player.addXp(50)
    println("Level setelah +50 XP: ${player.level}")
    
    player.addXp(60)
    println("Level setelah +60 XP: ${player.level}")
}
