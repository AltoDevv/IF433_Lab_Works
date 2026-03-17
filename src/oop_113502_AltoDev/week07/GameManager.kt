package oop_113502_AltoDev.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        if (isGameRunning == true) {
            println("Game Is Running")
        }else {
            println("Starting Game Engine")
        }

    }
}