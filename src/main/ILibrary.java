package main;

import items.Book;
import main.exceptions.BorrowingBookLimitOver;
import main.exceptions.NotAuthorizedForAction;
import main.exceptions.PhoneNumberNotValid;
import peoples.Member;
import peoples.Staff;

import java.util.ArrayList;

public interface ILibrary {

    void addBook(Book book);
    boolean deleteBook(Book book, Staff staff) throws NotAuthorizedForAction;
    ArrayList<Member> addMember(Member member) throws PhoneNumberNotValid;
    boolean deleteMember(Staff staff, Member member) throws NotAuthorizedForAction;
    boolean issue(Member member, Book book) throws BorrowingBookLimitOver;
    boolean reissue(Member member, Book book);
    boolean returnBook(Member member, Book book);
}
