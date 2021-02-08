package oops


class House(val height: Double, val color: String,val price: Int = 5000000) {
    fun print(){
        println("House details [Height: $height, Color: $color, Price: $price]")
    }
    fun sum(i: Int, j: Int){
        println(i+j)
    }

}

fun main() {
    val house = House(color = "Yellow", height = 7.0, price = 1500000) //named parameters are useful as it helps you define the parameter in any order without affecting the working of the code
    val house2 = House(7.6,"Light Blue", 20000000)
    val house3 = House(color = "yellow",height = 6.8)

    house.print()
    house.sum(1,2)
    house2.print()
    house3.print()

}