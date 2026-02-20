package oop_113502_AltoDev.week03

class Employee(val name:String){
    var salary: Int = 0

    set(value) {
        if (value < 0) {
            println("gaji gaboleh mines")
            field = 0
        }else {
            field = value
        }
    }
}

fun main(){
    val e = Employee("Budi")
    println("---Test Error---")
    e.salary = 5000
}