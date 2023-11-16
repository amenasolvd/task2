package main;

import items.Book;
import items.Magazine;
import items.Newspaper;
import peoples.Member;
import peoples.Staff;

import java.util.ArrayList;

public class Library implements ILibrary {
    private static final String libraryName = "Billerica Public Library";
    private static final String website = "https://billericalibrary.org/";
    private static final String address = "15 Concord Rd, Billerica, MA 01821";
    private static final String phone = "(978) 671-0949";
    private static ArrayList<Book> bookList;
    private static ArrayList<Magazine> magazineList;
    private static ArrayList<Member> memberList;
    private static ArrayList<Staff> staffList;
    private static ArrayList<Newspaper> newspaper;

    public Library() {
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(ArrayList<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    public ArrayList<Newspaper> getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(ArrayList<Newspaper> newspaper) {
        this.newspaper = newspaper;
    }

    public void addBook(Book book) {
        getBookList().add(book);
    }

    public boolean deleteBook(Book book, Staff staff) {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getBookList().contains(book.getItemId())) {
                getBookList().remove(book);
            }
            return true;
        } else {
            System.out.println("You are not authorized to delete book");
            return false;
        }
    }

    public void addMember(Member member) {
        getMemberList().add(member);
    }

    public final boolean deleteMember(Staff staff, Member member) {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getMemberList().contains(member.getLibraryCardId())) {
                getMemberList().remove(member);
            }
            return true;
        } else {
            System.out.println("You are not authorized to delete member");
            return false;
        }
    }

    public boolean issue(Member member, Book book) {
        if (member.getAddIssuedBooks() >= 3) {
            System.out.println("you can't issue this book");
            return false;
        } else {
            member.addIssuedBook(book);
            bookList.remove(book);
            return true;
        }
    }

    public boolean reissue(Member member, Book book) {
        int reissueCount = 0;
        if (this.issue(member, book)) {
            reissueCount++;
        }
        this.issue(member, book);
        return true;
    }

    public boolean returnBook(Member member, Book book) {
        if (member.issuedBook.equals(book)) {
            bookList.add(book);
            member.issuedBook.remove(book);
            return true;
        }
        return false;
    }

    public static void printLibraryInfo() {
        System.out.println("Library Name: " + libraryName + '\'' +
                "Library address: " + address + '\'' +
                "Phone Number: " + phone + "\'" +
                "Website: " + website + '\'');
    }

    public static void printBookInfo(Book book) {
        for (Book i : bookList) {
            System.out.println("BookList : " + book);
        }
    }
}