package lecture_oop

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val filesaya = File("src/lecture_oop/contohfile.txt")
    val bacafile = filesaya.readText()
    println(bacafile)

    //cara 2
    println("cara 2")
    var filekamu = File("src/lecture_oop/contohfile.txt")
    var bacafile2 = filekamu.readLines()
    bacafile2.forEach {
        println(it)
    }

    //cara 3
    val br = BufferedReader(FileReader(filesaya))
    var baris: String? = br.readLine()
    while (baris != null) {
        println(baris)
        baris = br.readLine()
    }

    //cara 4
    val br2 = BufferedReader(FileReader(filesaya))
    br2.use {
        baris -> baris.lineSequence()
        .filter { it.isNotEmpty() }
        .forEach { println(it) }
    }

    //buat file
    val filebuat = File("src/lecture_oop/contohfile.txt")
    filebuat.writeText("Ini adalah baris pertama\n ini keduaa!!!")

    filebuat.appendText("\n ini kerja ketigaaaa!!!")

    //cara 1 isi konten
    val contenlist = listOf("nasi goreng","capcay","puyunghai")
    filebuat.appendText("\n"+ contenlist.joinToString("\n"))

    //cara 2 buat file isi konten
    filebuat.printWriter().use {
        out->
        out.println("ini contoh baris pertama pakai printwritter, 20, 3.8")
    }
}