package oop_113502_AltoDev.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan Judul:")
    val title = scanner.nextLine()

    println("Masukkan Peminjam:")
    val borrower = scanner.nextLine()

    println("Masukkan Lama Pinjam:")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Denda: ${loan.calculateFine()}")
}
