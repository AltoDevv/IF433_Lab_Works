package lecture_oop

class knd_mobil:kendaraan() {
    override fun jalan_maju() {
        super.jalan_maju()
    }
    private var jumlahBan:Int = 0

    init{
        jumlahBan = 4
        println("mobil punya $jumlahBan ban")
    }
}