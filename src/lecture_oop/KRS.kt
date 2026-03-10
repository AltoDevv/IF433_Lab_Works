package lecture_oop

class KRS(override val nama: String,
override val namaSiswa: String
) : Mahasiswa, Siswa {
    override fun belajar() {
        println("$nama sedang bljr")
        println("$namaSiswa sedang belajar juga")
    }

    override fun main_game() {
        super<Mahasiswa>.main_game()
    }
}