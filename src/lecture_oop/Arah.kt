package lecture_oop

enum class Arah(val petunjuk:String) {
    Atas("Naik"),
    Bawah("Turun"),
    Kanan("Belok"),
    Kiri("Nyasar");

    fun tampilan_isi_param() {
        println(petunjuk)
    }
}