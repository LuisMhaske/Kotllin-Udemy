package dataClasses


interface Lendable{
    fun borrow():Boolean
    fun returnBook():Boolean
}
abstract class InventoryItem(val title:String,val genre: String,val yearofpublication: Int, var borrow: Boolean): Lendable {
    override fun borrow():Boolean {
        if (borrow) {
            println("Book already borrowed")
            println("Avaliablity = $")
            return false
        } else {
            println("The book is available")
            borrow = true
            println("Book Borrowed successfully")
            return true
        }
    }

    override fun returnBook():Boolean {
        if (!borrow){
            println("The book cannot be returned as it was not borrowed")
            return false
        }
        else{
            println("Book Returned")
            borrow =false
            return true
        }
    }

    override fun toString(): String {
        return "Inventory Item[Title: $title,Genre: $genre, Release year: $yearofpublication, Available: $borrow]"
    }
    abstract fun copy():InventoryItem

}
class LibraryBook(title:String, val author:String, genre: String, yearofpublication: Int): InventoryItem(title,genre,yearofpublication,false){

    fun read():String{
        println("Reading....")
        return "still reading..."
    }
    override fun copy(): InventoryItem {
        val copy = LibraryBook(title, author,genre,yearofpublication)
        copy.borrow = this.borrow
        return copy
    }
}

class LibraryDVD(title: String,
                 genre: String,
                 val length: Int,
                 yearofpublication: Int) : InventoryItem(title, genre, yearofpublication, false) {

    fun watch(): String {
        println("Watching ")
        return title
    }

    override fun copy(): InventoryItem {
        val copy = LibraryDVD(title, genre, length, yearofpublication)
        copy.borrow = this.borrow

        return copy
    }
}
fun main() {
    val lbook = LibraryBook("Love","Luis","romance",2021)
    val dvd = LibraryDVD("Die hard","Action",2, 1995)
    println(message = lbook)
    println(message = lbook.borrow())
    println(message = lbook.read())
    println(message = lbook.returnBook())
    println(message = lbook)
    println(message = dvd.watch())

}