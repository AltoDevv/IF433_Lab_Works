package oop_113502_AltoDev.week08

fun main(){
    val rawapidata: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "electronic", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "clothing", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "electronic"),
        mapOf(),
        mapOf("name" to "Ghost Item", "type" to "clothing"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = apiparser()

    for (raw in rawapidata) {
        try {
            val result = parser.parseproduct(raw)

            result?.let {
                parser.checkout(it)
            }

        } catch (e: IllegalArgumentException) {
            println("Warning: ${e.message}")
        }
    }
}