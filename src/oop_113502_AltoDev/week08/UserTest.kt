package oop_113502_AltoDev.week08

object DatabaseMock{
    fun findUser(id: Int): UserProfile?{
        return if (id == 1) UserProfile("testuser", "test@test.com") else null
    }
}

fun rucnMockUnitTest(){
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T"){"test failed! initial is wrong."}
    println("test passed : initial is T")
}