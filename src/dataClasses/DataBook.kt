package dataClasses

class Book(val title: String, val author: String, val yearofpublication: Int, var price: Double) {

    // If the following method is not declared then it will just return <Packagename, classname, and the memory at which it is stored>
    //O/P: dataClasses.Book@29453f44
    override fun toString(): String {
        return "Book[title= $title, author= $author, publication year = $yearofpublication, price= $price]"
    }

}

data class DataBook(val title: String, val author: String, val yearofpublication: Int, var price: Double) {

}

fun main() {
    val book = Book("Super Book", "John Doe", 2017, 9.99)
    val book2 = Book("Super Book", "John Doe", 2017, 9.99)
    val dataBook = DataBook("Super Book", "John Doe", 2017, 9.99)
    val dataBook2 = DataBook("Super Book", "John Doe", 2017, 9.99)
    val dataBook3 = dataBook.copy()
    val dataBook4 = dataBook.copy(price = 11.99)

    val (title, author, year, price) = dataBook // can easily be decomposed i.e. you can easily save each of the property of data object into distinct variable.

    val set = hashSetOf(dataBook, dataBook2, dataBook4)

    println("$book \n")
    println("$dataBook \n")
    println("$dataBook3 \n")
    println("$dataBook4 \n")

    println(set)

    println(title)
    println(author)

    println(book == book2)//wont return desired o/p
    println(dataBook == dataBook2)//returns desired o/p
}