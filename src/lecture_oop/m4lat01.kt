package lecture_oop

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(utsMhs: Double, uasMhs: Double, tugasMhs: Double, jnskur: kurikulum): Double {
        return jnskur.hitung_bobot(utsMhs, uasMhs, tugasMhs)
    }

}

interface kurikulum{
    fun hitung_bobot (uts: Double, uas: Double,tugas: Double): Double
}

class kurikulum_2013: kurikulum{
    override fun hitung_bobot (uts: Double, uas: Double,tugas: Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class kurikulum_merdeka: kurikulum{
    override fun hitung_bobot (uts: Double, uas: Double,tugas: Double): Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.5)
    }
}

class db_khs {
    fun simpan_na_db(nim:String, nama:String, nilaiAkhir:Double):String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }
    fun load_db(nim:String):String {
        return "Berhasil load data $nim"
    }
}

class manager_hitung_khs{
    fun mulai_perhitungan(quizTugas: Double, aktivitasTugas: Double, utsKamu: Double, uasKamu: Double, jnskur: kurikulum): Double{
        val khsMhs = proses_khs()
        val nilaiTugas: Double= khsMhs.hitung_nilai_tugas(quizTugas, aktivitasTugas)
        val nilaiAkhirMhs: Double= khsMhs.hitung_nilai_akhir(utsKamu,uasKamu, nilaiTugas, jnskur)
        return nilaiAkhirMhs
    }
}

class manager_db {
    fun mulai_simpan(nimMhs: String,namaMhs: String,NilaiMhs: Double): String{
        val dbMhs = db_khs()
        return dbMhs.simpan_na_db(nimMhs,namaMhs,NilaiMhs)
    }
}

fun main() {
    val mngkhs = manager_hitung_khs()
    val naMhs1: Double = mngkhs.mulai_perhitungan(85.67,87.30,70.36,93.57, kurikulum_2013())
    val naMhs2: Double = mngkhs.mulai_perhitungan(85.67,87.30,70.36,93.57, kurikulum_merdeka())

    val managerDb = manager_db()
    println(managerDb.mulai_simpan("13","ucok",naMhs1))
    println(managerDb.mulai_simpan("31","intan",naMhs2))

    /*val khsMhs = proses_khs()
    val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(83.37, 96.45)
    val nilaiAkhir: Double = khsMhs.hitung_nilai_akhir(85.67, 70.40, nilaiTugas, kurikulum_merdeka())
    val nilaiAkhir2: Double = khsMhs.hitung_nilai_akhir(85.67, 70.40, nilaiTugas, kurikulum_2013())

    val dbMhs = proses_db_khs()
    val statSimpan: String = dbMhs.simpan_na_db("123", "Titus", nilaiAkhir)
    val statSimpan2: String = dbMhs.simpan_na_db("321", "ani", nilaiAkhir2)
    println(statSimpan)
    println(statSimpan2)
    */


}