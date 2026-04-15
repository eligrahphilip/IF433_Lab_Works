package oop_00000138865_EligrahPhilipMapaKogoya.week08

class NotificationService {

    fun sendNotification(user: UserProfile) {
        println("=== Sending notification to: ${user.name} ===")

        // Smart cast: Kotlin otomatis cast ke String non-null setelah pengecekan
        val email = user.email
        if (email != null) {
            println("  [EMAIL] Mengirim email ke: $email")
        }

        val phone = user.phone
        if (phone != null) {
            println("  [SMS] Mengirim SMS ke: $phone")
        }

        if (user.email == null && user.phone == null) {
            println("  [WARN] Tidak ada kontak tersedia untuk ${user.name}")
        }
    }
}
