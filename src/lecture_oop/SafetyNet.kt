package lecture_oop

fun main(){
    var name: String? = null
    try{
        print("$name")
        println("${name!!.uppercase()}")
    } catch (e: NullPointerException){
        println("aDa error excception ini pesan errornya ${e.message}")
    }

    val mixedData: List<Any> = listOf(1,"Budi",10,"online")
    for(item in mixedData){
        val hasil = item as? String
        if (hasil != null) println(item)
    }
}