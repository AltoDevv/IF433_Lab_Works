package lecture_oop

fun main() {
    Koneksi.kon = "localhost:1111"
    println("Link ${Koneksi.kon}")
    Koneksi.konek_db()

    Hitungan.tambah(40, 10)
    Hitungan.kali(10, 20)

    println("nama matkul: ${Hitungan.namaMTK}")

    Hitungan.buat_data("user biasa")

    val dt = SaveData("maris",10,10,5)
    println("nama char ${dt.namaChar}")
    println(dt)

    val dtcopy = dt.copy("alto")
    println("nama char ${dtcopy.namaChar}")
    println(dtcopy)

    println("---class enum---")
    val arh = Arah.Atas
    println(arh.tampilan_isi_param())

    println("---sealed---")
    val hasil:Hasil = Hasil.Sukses("berhasil")
    hasil.handle_responses(hasil)
}