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

    val data3 = data1.copy(age = 23)
    println("Hasil Copy : $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when(response){
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("\n=== TEST GAME ===")
    GameManager.startGame()
    GameManager.startGame()

}