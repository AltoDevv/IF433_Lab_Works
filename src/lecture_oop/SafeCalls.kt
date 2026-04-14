package lecture_oop

class alamat(val kota:String?)
class mahasiswa(val address: alamat)

fun main(){
    val mhs1 = mahasiswa(alamat("tanggerang)"))
    val mhs2 = mahasiswa(alamat(null))

    println("Mahasiswa 1 : ${mhs1.address.kota}")
    println("Mahasiswa 2 : ${mhs2.address.kota}")

    val tetapAlamat = alamat(null)
    val defaultAlamat = tetapAlamat.kota?.let{
        adrs->"alamatnya adalah $adrs"
    } ?: "alamat kamu kosong"
    println("Alamat Kamu : ${defaultAlamat}")
}