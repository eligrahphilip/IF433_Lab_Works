// CHECKPOINT 3: create Button class implementing Clickable
class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
