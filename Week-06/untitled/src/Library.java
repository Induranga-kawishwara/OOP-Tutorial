public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    // populate arraylist books with 4 book objects
    void populate() {
        for (int i=1; i <= 4; i++) {
// create a new book with "some" data
            Book b = new Book();
            b.author = "author" + i;
            b.title = "title" + i;
// add book in list
            books.add(b);
        }
    }
    // print details of all books in the library
    void displayAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println("Book: author=" + b.author + ", title=" + b.title);
        }
    }
    public static void main(String[] args) {
        Library lib = new Library();
        lib.populate();
        lib.displayAllBooks();
    }
}
