package main;

import items.Book;
import items.Newspaper;
import main.exceptions.BorrowingBookLimitOverException;
import main.exceptions.NotAuthorizedException;
import main.exceptions.PhoneNoNotValidException;
import peoples.Member;
import peoples.Staff;

public interface ILibrary {

    void addBook(Book book);
    boolean deleteBook(Book book, Staff staff) throws NotAuthorizedException;
    void addMember(Member member) throws PhoneNoNotValidException;
    boolean deleteMember(Staff staff, Member member) throws NotAuthorizedException;
    boolean issue(Member member, Book book) throws BorrowingBookLimitOverException;
    boolean reissue(Member member, Book book);
    boolean returnBook(Member member, Book book);
    void addNewspaper(Newspaper newspaper);
}
