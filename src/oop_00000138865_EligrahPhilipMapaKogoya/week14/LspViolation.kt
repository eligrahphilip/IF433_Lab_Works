package oop_00000138865_EligrahPhilipMapaKogoya.week14

open class Rectangle {
    open var width: Int = 0
        set(value) { field = value }
    open var height: Int = 0
        set(value) { field = value }
    fun area() = width * height
}

class Square : Rectangle() {
    override var width: Int = 0
        set(value) { field = value; super.height = value }
    override var height: Int = 0
        set(value) { field = value; super.width = value }
}
