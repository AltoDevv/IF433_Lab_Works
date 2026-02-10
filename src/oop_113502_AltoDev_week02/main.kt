package oop_113502_AltoDev_week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("---Aplikasi PMB UMN---")
    print("Masukkan Nama:")
    val name = scanner.nextLine()
    print("Masukkan NIM (wajib 5 karakter):")
    val nim = scanner.next()

    scanner.nextLine()

    print("pilih jalur (1.reguler, 2.umum :")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1){
        print("Masukkan jurusan : ")
        val major = scanner.nextLine()

        val s1 = Student(name,nim,major)
        println("Terdaftar di: ${s1.major} dengan gpa awal ${s1.gpa}")
    }else if (type == 2){
        val s2 = Student(name,nim)
        println("Terdaftar di : ${s2.major} dengan gpa awal ${s2.gpa}")
    }else {
        println("pilihan gada, gagal")
    }

    if(nim.length != 5){
        println("Error: pendaftaran dibatalkan. nim harus 5 karakter")
    }else{
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name,nim,major)
        println("Status : pendaftaran selesai.")
    }
}