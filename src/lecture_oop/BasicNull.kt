package lecture_oop

class profile_page(val idProfile:String, val statusOnline:String){
    fun ganti_foto(fileFoto: String){
        println("$fileFoto")
    }
}

fun main(){
    var nama:String? = " Wirawan"
    nama = null
    println("nama kamu :$nama")

    val profile = profile_page("12345","online")
    println("id : ${profile.idProfile},status : ${profile.statusOnline}")

    profile.ganti_foto("foto.jpg")
}