package peoples;

import items.Book;

import java.util.List;

public interface MemberInterface {

    List<Book> addIssuedBook(Book book);
    int getAddIssuedBooks();
}
