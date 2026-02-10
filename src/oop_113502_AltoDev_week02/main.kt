package oop_113502_AltoDev_week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("---Aplikasi PMB UMN---")
    print("Masukkan Nama:")
    val name = scanner.nextline()
    print("Masukkan NIM (wajib 5 karakter):")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("Error: pendaftaran dibatalkan. nim harus 5 karakter")
    }else{
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name,nim,major)
        println("Status : pendaftaran selesai.")
    }
}