package oops

enum class Color(val rgb: Int) {
    RED(0XFF0000),GREEN(0X00FF00),BLUE(0X0000FF), YELLOW(0xFFFF00);

    fun containsRed(): String {
        return if(this.rgb and 0xFF0000 !=0) {
            "Contains Color Red"
        } else{
            "Color Red is missing"
        }
    }
}

fun main(args: Array<String>) {
    println(0x10)
    println(0x1F)
    println(0xFF)
    println(0xCAFEBABE)

    println(0x000000) //black
    println(0xFFFFFF) //White
    println(0xFF0000) //red
    println(0b1101 and 0b1011) //9
    println(Color.RED.containsRed())
    println(Color.YELLOW.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.GREEN.containsRed())
    println(0b1101 or 0b1000) //13
    println(0b1101 xor 0b1000) //5

    //inverse
    //0b10011.inv() == 0b...01100
    println(0b10011.inv()) //wrong answer as it is of type integer and int is going to take up 4 bytes on your machine and 1 byte refers to 8 bit (4*8bit =32bits)
                           //and the number defined by us takes only 5 bits and we are defining only the last 5 bits so you dont know what the rest of them are
    //0x0000001F == 0b00...0011111 // using this we can filter out our result
    println(0b10011.inv() and 0x0000001F) //0b01100 =12
}