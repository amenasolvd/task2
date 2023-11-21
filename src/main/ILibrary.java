package main;

import items.Book;
import items.Newspaper;
import linkedlist.CustomLinkedList;
import main.exceptions.BorrowingBookLimitOverException;
import main.exceptions.NotAuthorizedException;
import main.exceptions.PhoneNoNotValidException;
import peoples.Member;
import peoples.Staff;
import java.util.Set;

public interface ILibrary {

    CustomLinkedList<Book> addBook(Book book);
    boolean deleteBook(Book book, Staff staff) throws NotAuthorizedException;
    CustomLinkedList<Member> addMember(Member member) throws PhoneNoNotValidException;
    boolean deleteMember(Staff staff, Member member) throws NotAuthorizedException;
    boolean issue(Member member, Book book) throws BorrowingBookLimitOverException;
    boolean reissue(Member member, Book book);
    boolean returnBook(Member member, Book book);
    Set<Newspaper> addNewspaper(Newspaper newspaper);
}
