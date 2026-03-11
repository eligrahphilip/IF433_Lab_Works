// CHECKPOINT 1: (trial) create Clickable interface with backing field error
// interface Clickable {
//     val name: String = "Tombol Rahasia"
//     fun click()
// }

// CHECKPOINT 2: fix Clickable interface using abstract property
interface Clickable {
    val name: String // Abstract property, tidak ada nilai default
    fun click()
}
