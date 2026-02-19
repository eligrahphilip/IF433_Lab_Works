package oop_00000138865_EligrahPhilipMapaKogoya.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")
    
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    
    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()
    
    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\nPertarungan dimulai!")
    println("$heroName (HP: ${hero.hp}) vs Enemy (HP: $enemyHp)\n")

    while (hero.isAlive() && enemyHp > 0) {
        println("--- GILIRAN ANDA ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= baseDamage
            println("Enemy menerima $baseDamage damage! (HP Enemy: $enemyHp)")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik!")
                hero.takeDamage(enemyDamage)
                println("$heroName menerima $enemyDamage damage! (HP Hero: ${hero.hp})")
            }
        } else if (choice == 2) {
            println("$heroName kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }

        println()
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("$heroName menang! Enemy telah dikalahkan!")
    } else if (!hero.isAlive()) {
        println("$heroName kalah! Enemy menang!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
