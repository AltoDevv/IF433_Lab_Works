package oop_113502_AltoDev.week05

class admin(nama: String) : pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("[$nama] sedang dmerekap data absensi mahasiswa di kelas")
    }
}