import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for(Book book : books) {
            if (StringUtils.included(book.title(), title))
                foundBooks.add(book);
        }
        return foundBooks;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for(Book book : books) {
            if (StringUtils.included(book.publisher(), publisher))
                foundBooks.add(book);
        }
        return foundBooks;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for(Book book : books) {
            if (book.year() == year)
                foundBooks.add(book);
        }
        return foundBooks;
    }
}
