package oop_113502_AltoDev.week05

fun main(){
    //tugas 1
    val math = MathHelper()
    println("Luas Persegi:"+math.hitungluas(4))
    println("Luas Persegi panjang:"+math.hitungluas(5,3))
    println("Luas lingkaran:"+math.hitungluas(7.0))

    //tugas 2
    val ewallet = EWallet("Alto", 50000.0)
    val creditcard = CreditCard("Alto", 100000.0)

    val payments = arrayListOf<PaymentMethod>()

    payments.add(ewallet)
    payments.add(creditcard)

    for (p in payments) {
        p.processPayment(75000.0)
    }

    val dosen1 = dosen("Pak Alex","01223456")
    val admin1 = admin("Bu Siti")

    val daftarPegawai: List<pegawai> = listOf (dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is admin ->{
                println("=> Terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------")
    }
}