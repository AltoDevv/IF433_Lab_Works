package oop_113502_AltoDev.week08

class apiparser{
    fun parseproduct(rawjson: Map<String, Any?>): product?{
        val id = requireNotNull(rawjson["id"] as? String){
            "api invalid: missing id"
        }

        val name = requireNotNull(rawjson["name"] as? String){
            "api invalid: missing name"
        }

        val type = rawjson["type"] as? String

        return when(type){
            "electronic"->{
                val warranty = (rawjson["warranty"] as? Int) ?: 12
                electronic(id,name,warranty)
            }

            "clothing"->{
                val size = (rawjson["size"] as? String) ?: "all size"
                clothing(id,name,size)
            }

            else -> null

        }

    }

    fun checkout(product: product) {

        when (product) {
            is electronic -> {
                println("${product.name} (Warranty ${product.warrantmonths})")
            }

            is clothing -> {
                println("${product.name} (Size ${product.size})")
            }
        }

        val productid = when (product) {
            is electronic -> product.id
            is clothing -> product.id
        }

        val trxid = JavaPaymentService.processpayment(productid)!!
        println("Transaction ID: $trxid")
    }
}