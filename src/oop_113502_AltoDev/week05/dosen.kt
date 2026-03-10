package oop_113502_AltoDev.week05

class dosen(nama: String,val nidn: String): pegawai(nama) {
    override fun bekerja(){
        println("[$nama] bekerja dan revisi rpkps")
    }

    fun mengajar(){
        println("[$nama] mengajar mahasiswa di kelas")
    }
}