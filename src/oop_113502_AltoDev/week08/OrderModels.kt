package oop_113502_AltoDev.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class order( val deliveryDetails: DeliveryDetails?, val totlaPrice: Int?)
