package oop_00000138865_EligrahPhilipMapaKogoya.week08

fun runMockUnitTest() {
    println("\n=== [UserTest] Simulasi Unit Test ===")

    val validUser: UserProfile? = UserProfile("U01", "Alice", "alice@mail.com", null)
    val nullUser: UserProfile? = null

    // !! digunakan untuk force-unwrap; akan crash jika null (simulasi test failure)
    println("Valid user name: ${validUser!!.name}")

    try {
        // Ini akan melempar NullPointerException — simulasi test failure
        println("Null user name: ${nullUser!!.name}")
    } catch (e: NullPointerException) {
        println("[TEST FAILED] NullPointerException tertangkap: ${e.message}")
    }
}
