package oop_113502_AltoDev.week07

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alto",22)
    val reg2 = RegularUser("Alto",22)
    println(reg1)
    println("Sama?${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alto",22)
    val data2 = DataUser("Alto",22)
    println(data1)
    println("sama ? ${data1 == data2}")

}