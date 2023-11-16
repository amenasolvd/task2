package peoples;

import items.Book;

import java.util.List;

public interface IMember {

    List<Book> addIssuedBook(Book book);
    int getAddIssuedBooks();
}
