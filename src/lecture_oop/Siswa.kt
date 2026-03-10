package lecture_oop

interface Siswa {
    val namaSiswa: String
    fun belajar()
    fun jajan(){
        println("Siswa Jajan")
    }
    fun main_game(){
        println("Siswa main game")
    }
}