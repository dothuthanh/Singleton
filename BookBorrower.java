public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean havaBook = false;
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();
        if(borrowedBook == null){
            havaBook = false;
        }else {
            havaBook = true;
        }
    }
    public String getAuthorAndTitle(){
        if(havaBook){
            return  borrowedBook.getAuthorAndTitle();
        }
        return " I don't have the book";
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
