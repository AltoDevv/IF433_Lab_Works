package lecture_oop

fun main(){
    println("==== LIST OF ====")
    var arMhs = listOf("budi","susi","titus")
    println(arMhs)
    println("panjang list ${arMhs.size}")
    println(arMhs[1])
    for(a in arMhs){
        println(a)
    }

    println("====== MUTABLE LIST ======")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)

    arAngka.add(777)

    arAngka[2]=123

    arAngka.removeAt(3)

    println(arAngka)

    println("===== Set Of =====")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga ?"+ arUrutan.contains(40))

    println("=== MUTABLE SET OF ===")
    var arMakanan = mutableSetOf("Indomie","popmie","bakso")
    arMakanan.add("ketoprak")
    arMakanan.add("Indomie")
    arMakanan.remove("bakso")
    println(arMakanan)

    println("=== MAP OF ===")
    var arSiswa = mapOf(
        "andi" to 90,
        "teni" to 73,
        "ivander" to 40
    )
    println("banyak data siswa :"+arSiswa.size)
    println("Nilai si andi : "+arSiswa["Andi"])
    println("Semua Keys :"+arSiswa.keys)
    println("Semua values :"+arSiswa.values)
    println("Semua Keys :"+arSiswa.containsKey("teni"))
    println(arSiswa)

    println("====== MAP OF MUTABLE ======")
    var arMenu = mutableMapOf(
        "nasi" to 1500,
        "mie" to 2000,
        "sayur bayam" to 5000
    )
    println("banyak menu"+ arMenu.size)
    arMenu["nasi"] = 15000
    arMenu.remove("mie")
    arMenu.put("mie", 20000)
    println(arMenu)

    println("===== LAMBDA =====")
    fun tambah(a:Int,b:Int):Int{
        return a + b
    }
    var kurang = {a:Int, b:Int -> a-b}

    println("Kurang kurangan: ${kurang(5,3)}")

    var pangkat = {x:Int -> x*x}
    var hitungpangkat:(Int) -> Int = {it*it}
    println("Pangkat "+hitungpangkat(5))


}