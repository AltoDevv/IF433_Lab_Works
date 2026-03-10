package oop_113502_AltoDev.week05

fun main(){
    val dosen1 = dosen("Pak Alex","01223456")
    val admin1 = admin("Bu Siti")

    val daftarPegawai: List<pegawai> = listOf (dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is admin ->{
                println("=> Terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------")
    }
}