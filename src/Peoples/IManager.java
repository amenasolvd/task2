package Peoples;

import Items.Book;
import main.Library;

public interface IManager {
    public void addBook(Library library, Book book);
    public void deleteBook(Book book, Library library);

}
