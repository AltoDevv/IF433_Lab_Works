package lecture_oop

open class Karyawan{
    private var nama:String = "belum ada"
    private var gaji:Int = 0
    protected var namaPacar:String = "jomblo"

    public var umur:Int = 0
        set(value){
            if(value<0){
                println("umur gbisa mines")
            }else{
                field = value
            }
        }
        get(){
            return field;
        }

    public fun set_nama(namakamu:String){
        if(namakamu.length == 0){
            println("nama ga boleh kosong")
        }else{
            this.nama = namakamu
        }
    }

    public fun get_nama():String{
        return this.nama
    }

    public fun set_gaji(gajikamu:Int){
        if(gajikamu < 0){
            println("Masa gaji minus")
        }else{
            this.gaji = gajikamu
        }
    }

    public fun get_gaji():Int{
        return this.gaji
    }
}

class DataPribadi: Karyawan(){
    public fun ambil_data_pacar():String{
        return this.namaPacar
    }
}

fun main(){
    /*var kry = Karyawan()
    kry.set_nama("Ucek gosong")
    println("Hi " + kry.get_nama())

    kry.set_gaji(50)
    println("Gaji Kamu " + kry.get_gaji())

     */
    var dp = DataPribadi()
    println("Nama Pacar : "+dp.ambil_data_pacar())
    dp.umur = 10
    println("Nama Karyawan : "+dp.get_nama()+" umur aku "+ dp.umur)
}