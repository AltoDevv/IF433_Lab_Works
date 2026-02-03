package oop_113502_AltoDev.week01

fun main (){
    val name = "John Thor"
    val score = 80

    println("Name: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 ->"A"
        in 80..89 ->"B"
        in 70..79 ->"C"
        else ->"D"
    }
    println("Grade kamu: $grade")

    println("status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if(score >75) "lulus" else "tidak lulus"
