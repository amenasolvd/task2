package peoples;

import items.Book;

import java.util.List;
import java.util.TreeSet;

public interface IMember {

    TreeSet<Book> addIssuedBook(Book book);
    int getAddIssuedBooks();
}
