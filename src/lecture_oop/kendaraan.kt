package lecture_oop

open class kendaraan {
    private var merek:String =""
    private var kecepatan:Int = 0

    open fun jalan_maju(){
        println("jalan maju $kecepatan")
    }
}