package main;

import items.Book;
import items.Magazine;
import items.Newspaper;
import peoples.Member;
import peoples.Staff;

import java.util.ArrayList;

public interface LibraryInterface {

   ArrayList<Member> getMemberList();
   ArrayList<Staff> getStaffList();
   void setMemberList(ArrayList<Member> memberList);
   void setStaffList(ArrayList<Staff> staffList);
    ArrayList<Book> getBookList();
    void setBookList(ArrayList<Book> bookList);
    ArrayList<Magazine> getMagazineList();
   void setMagazineList(ArrayList<Magazine> magazineList);
    ArrayList<Newspaper> getNewspaper();
    void addBook(Book book);
    boolean deleteBook(Book book, Staff staff);
    void addMember(Member member);
    boolean deleteMember(Staff staff, Member member);
    Boolean issue(Member member, Book book);
    Boolean reissue(Member member, Book book);
    Boolean returnBook(Member member, Book book);
}
