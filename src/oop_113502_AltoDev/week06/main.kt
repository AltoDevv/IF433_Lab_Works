package oop_113502_AltoDev.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout ...")
    method.pay(amount)
}

fun main(){

    //tugas
    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

    //tutorial
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === testing checkout ===")
    processCheckout(pay1,50000.0)
    processCheckout(pay2,150000.0)
}