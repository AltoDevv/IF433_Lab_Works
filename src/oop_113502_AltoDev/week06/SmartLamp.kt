package oop_113502_AltoDev.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }
}