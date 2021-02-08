package oops


class House(val height: Double, val color: String,val price: Int) {
    fun print(){
        println("House details [Height: $height, Color: $color, Price: $price]")
    }

}

fun main() {
    val house = House(color = "Yellow", height = 7.0, price = 1500000) //named parameters are useful as it helps you define the parameter in any order without affecting the working of the code
    val house2 = House(7.6,"Light Blue", 20000000)

    house.print()
    house2.print()
}