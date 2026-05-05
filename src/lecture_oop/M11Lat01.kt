package lecture_oop

fun String.DasarExtension(): String{
    return "halo $this"
}

fun String.RubahHurufBesarDepan(): String{
    var hasil = ""
    hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return hasil
}

fun String.tentukanKelulusan(nilai:Int):String{
    var hasil = ""
    if(nilai > 70){
        hasil = "lulus"
    }else {
        hasil = "remedial"
    }
    return "$this $hasil"
}

fun String?.CekNullDanEmpty():String{
    var hasil = ""
    if(this == null || this.isEmpty()){
        hasil =  "ga boleh null atau kosong"
    }else{
        hasil = "password kamu $this"
    }
    return hasil
}

data class Manusia(var nama: String, var umur: Int)

fun main(){
    println("Wirawan".DasarExtension())

    val nama1 = "budi sihombing"
    println(nama1.uppercase())

    println("budi udin".RubahHurufBesarDepan())

    println("Kelulusan Kamu".tentukanKelulusan(71))

    var pwkamu:String? = null
    println(pwkamu.CekNullDanEmpty())

    var huruf:String = "UMN"
    var hasilKampus = huruf.let {
        if(it =="umn"){
            println("kampus saya")
        }else {
            println("Bukan kampus saya")
        }
    }
    println(hasilKampus)

    var nilaiKamu = 70.run{
        if(this > 70){
            println("lewat")
        }else{
            println("gagal")
        }
    }

    val pekerjaan = with("Mahasiswa"){
        if(this=="Mahasiswa"){
            println("Pelajar")
        }else{
            println("Pekerja")
        }
    }

    val orang = Manusia("Budi", 25).apply{
        nama = "Michael Jackson"
        umur = 27
    }
    println("Nama kamu ${orang.nama} umur kamu ${orang.umur}")

    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also{
        println("Sebelum $deretAngka")
    }.add(5)
    println("Setelah $deretAngka")

}