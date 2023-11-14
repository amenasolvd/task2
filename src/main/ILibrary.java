package main;

import items.Book;
import peoples.Member;
import peoples.Staff;

public interface ILibrary {

    void addBook(Book book);
    boolean deleteBook(Book book, Staff staff);
    void addMember(Member member);
    boolean deleteMember(Staff staff, Member member);
    boolean issue(Member member, Book book);
    boolean reissue(Member member, Book book);
    boolean returnBook(Member member, Book book);
}
