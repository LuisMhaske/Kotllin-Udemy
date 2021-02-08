package constructor

class Books(val title:String, val author: String,var year: Int, var borrowed:Boolean) {

    fun borrow(){
        if (borrowed){
            println("Book already borrowed")
        }else {
            println("The book is available")
            borrowed = true
            println("Book Borrowed successfully")

        }
    }

    fun returnBook(){
        if (!borrowed){
            println("The book cannot be returned as it was not borrowed")

        }
        else{
            println("Book Returned")
            borrowed =false

        }
    }
    fun print(){
        println("Book details [title =$title,author = $author,year = $year]")
    }

}

fun main() {
    val book = Books("Harry potter","J.K. Rowling",2006,false)
    book.returnBook()
    book.borrow()
    book.borrow()
    book.returnBook()
    book.print()


}