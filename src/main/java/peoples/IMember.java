package peoples;

import items.Book;

public interface IMember {

    void addIssuedBook(Book book);
    int getAddIssuedBooksCount();
}