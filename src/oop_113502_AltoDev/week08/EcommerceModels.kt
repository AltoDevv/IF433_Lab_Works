package oop_113502_AltoDev.week08

sealed class product

data class electronic(
    val id: String,
    val name: String,
    val warrantmonths: Int
): product()

data class clothing(
    val id: String,
    val name: String,
    val size: String
): product()