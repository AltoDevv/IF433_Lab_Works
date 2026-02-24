package lecture_oop

class knd_motor:kendaraan() {
    override fun jalan_maju() {
        super.jalan_maju()
    }
    private var jumlahBan = 0

    init{
        jumlahBan = 2
        println("jumlahBan motor ban saya = $jumlahBan")
    }
}