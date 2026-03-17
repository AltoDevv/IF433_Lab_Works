package lecture_oop

sealed class Hasil {
    data class Sukses(val data:String):Hasil();
    data class Error(val ex:Exception):Hasil();
    object loading:Hasil();

    fun handle_responses(res:Hasil){
        when(res){
            is Sukses -> {println("sukses lempar data")}
            is Error -> {println("error ${res.ex}")}
            loading -> {println("loading")}

        }
    }
}