package lecture_oop

class MyCar{
    var warna:String = "cetakbiru"
    var kecepatan:Int = 50

    init{
        if(kecepatan >=70) {
            println("kecepatan banget")
        }else{
            println("cepet lambat")
        }
    }

    constructor(speed:Int = 10, brake:Double=1.3){
        kecepatan = speed
        println("ini sekun constructor $kecepatan dan $brake")
    }

    fun jalan(){
        println("Kecepatan $warna luarbiasa")
    }
}

fun main() {
    val myCar = MyCar();
    myCar.jalan()
    println("warna = ${myCar.warna} sebelum diubah ")
    myCar.warna = "cetakabu"
    println("warna = ${myCar.warna} sesudah diubah")

    val myCar2 = MyCar(100,3.4)
}