package oop_00000138865_EligrahPhilipMapaKogoya.week08

data class Address(val city: String?)

data class Customer(
    val name: String,
    val address: Address?
)

data class Order(
    val orderId: String,
    val customer: Customer?
)
