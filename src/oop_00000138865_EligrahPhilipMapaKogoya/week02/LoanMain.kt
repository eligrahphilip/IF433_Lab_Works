package oop_00000138865_EligrahPhilipMapaKogoya.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== LIBRARY FINE SYSTEM ===")
    
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()
    
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    
    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()
    
    if (loanDuration < 0) {
        loanDuration = 1
        println("Durasi tidak valid, diubah menjadi 1 hari.")
    }

    val loan = Loan(bookTitle, borrower, loanDuration)
    
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}
