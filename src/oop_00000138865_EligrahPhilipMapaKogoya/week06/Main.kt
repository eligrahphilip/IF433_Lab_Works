// CHECKPOINT 12: implement decoupled processCheckout in main
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // CHECKPOINT 19: (task) instantiate smart devices in main
    println("\n=== SMART HOME SYSTEM ===")
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    // CHECKPOINT 20: (task) test smart home system logic in main
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== ACTIVATE SECURITY MODE ===")
    hub.activateSecurityMode()

    println("\n=== TURN OFF ALL SWITCHES ===")
    hub.turnOffAllSwitches()
}
