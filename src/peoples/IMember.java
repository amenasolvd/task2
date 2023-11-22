package peoples;

import items.Book;

import java.util.List;
import java.util.TreeSet;

public interface IMember {

    void addIssuedBook(Book book);
    int getAddIssuedBooksCount();
}
