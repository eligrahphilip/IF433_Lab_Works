package oop_00000138865_EligrahPhilipMapaKogoya.week07

fun main() {
    // CHECKPOINT 4: test Singleton and Companion Object in main
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    // CHECKPOINT 5: (trial) demonstrate regular class equality failure
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    // CHECKPOINT 6: implement data class for structural equality
    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    // CHECKPOINT 7: implement copy and destructuring on data class
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    // CHECKPOINT 10: (trial) trigger non-exhaustive when compiler error
    // val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    // val uiMessage = when (response) {
    //     is ApiResponse.Success -> "Tampilkan: ${response.data}"
    //     is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    // }

    // CHECKPOINT 11: resolve sealed class exhaustive check
    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // CHECKPOINT 18: (task) test GameManager singleton in main
    println("\n=== TEST GAME MANAGER SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame() // Panggil dua kali untuk buktikan Singleton

    // CHECKPOINT 19: (task) simulate rarity and factory instantiation
    println("\n=== TEST RARITY & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println(starterWeapon)

    // CHECKPOINT 20: (task) test data class copy and sealed class event dispatch
    println("\n=== TEST COPY & EVENT DISPATCH ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Senjata di-upgrade: $upgradedItem")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
