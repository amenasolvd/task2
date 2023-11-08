package Peoples;

import Items.Book;

public interface ILibrarian {
    public Boolean issue(Member member, Book book);
    public Boolean reissue(Member member, Book book);
    public Boolean returnBook(Member member, Book book);
}
