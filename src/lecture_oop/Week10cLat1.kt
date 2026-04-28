package lecture_oop

class nonGeneric(var hasil:Any)

class generic<T>(var hasil:T)

class Kota <T,V>(var kodepos:T, var telp:V)

fun <T> cobaFungsi(angka :T):T{
    return angka
}

fun <T: Number> tambah(angka :T): Double{
    return angka.toDouble() + 50
}

fun <T: Number> kurang(angka :T): Int{
    return angka.toInt() - 50
}

class kalkulator <T: Number>(val a:T, val b:T){
    fun kali():Double{
        return a.toDouble() * b.toDouble()
    }

    fun bagi():Int {
        return a.toInt() / b.toInt()
    }
}

fun <T> nilaiKKM(list: List<T>, kkm:T):List<T> where T:Comparable<T> {
    return list.filter{it >= kkm}
}

fun main(){
    println("===== generic where =====")
    val nilaiMhs = listOf(80,41,90,100,32,56,78,67)
    val nilaiFilter = nilaiKKM(nilaiMhs,70)
    println(nilaiFilter)

    println("==== generic function in class ====")
    val kalk = kalkulator(10.2,5.5)
    println("hasil kali ${kalk.kali()}")
    println("hasil bagi ${kalk.bagi()}")

    println("=== generic constraint ===")
    println("hasil tambah ${tambah(100.5)}")
    println("hasil kurang ${kurang(100.5)}")

    println("==== non generic ====")
    val nGen = nonGeneric(hasil = 100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    println("==== generic ====")
    val gen = generic(hasil = 200)
    println(gen.hasil + 50)

    println("==== generic 2 parameter ====")
    val city = Kota(12345,124124)
    println("Kodepos kamu " + city.kodepos)
    println("Kodepos kamu " + city.telp)

    println("==== generic function ====")
    println("Hasil ${cobaFungsi(angka = 10)}")
}