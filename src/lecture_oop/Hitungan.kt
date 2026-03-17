package lecture_oop

class Hitungan private constructor(val tipe: String) {
    fun show_data(){
        println("isi param class : ${tipe}")
    }
    companion object {
        const val namaMTK:String = "matematika"

        fun tambah(a:Int, b:Int){
            println("hasil pertambahan" + (a+b))
        }

        fun kali(a:Int, b:Int){
            println("hasil kali" + (a*b))
        }

        fun buat_data(tipeUser:String){
            Hitungan(tipeUser)
        }
    }
}