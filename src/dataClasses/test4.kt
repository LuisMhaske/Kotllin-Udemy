package dataClasses


interface Lendable{
    fun borrow()
    fun returnBook()
}
abstract class InventoryItem(val title:String,val genre: String,val yearofpublication: Int, var borrow: Boolean): Lendable {
    override fun borrow() {
        if (!borrow) {
            borrow = true
        }
        else{
            println("Book already borrowed")

        }
    }

    override fun returnBook() {
        if (borrow){
            borrow = false
        }else{
            println("Book available")
        }
    }

    override fun toString(): String {
        return "Inventory Item[Title: $title,Genre: $genre, Release year: $yearofpublication, Available: $borrow]"
    }
    abstract fun copy():InventoryItem

}
class LibraryBook(title:String, val author:String, genre: String, yearofpublication: Int): InventoryItem(title,genre,yearofpublication,false){

    fun read(){
        println("Reading....")
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

    fun watch() {
        println("Watching $title...")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryDVD(title, genre, length, yearofpublication)
        copy.borrow = this.borrow

        return copy
    }
}
fun main() {
    val lbook = LibraryBook("Love","Luis","romance",2021)
    println(lbook)
    println(lbook.borrow())
    println(lbook)
    println(lbook.returnBook())
    println(lbook)
}