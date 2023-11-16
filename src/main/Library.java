package main;

import items.Book;
import items.Magazine;
import items.Newspaper;
import main.exceptions.*;
import peoples.Member;
import peoples.Staff;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library implements ILibrary {

    private static final Logger LOG = LogManager.getLogger(main.Library.class);
    private static final String libraryName = "Billerica Public Library";
    private static final String website = "https://billericalibrary.org/";
    private static final String address = "15 Concord Rd, Billerica, MA 01821";
    private static final String phone = "(978) 671-0949";
    private static ArrayList<Book> bookList;
    private static ArrayList<Magazine> magazineList;
    private static ArrayList<Member> memberList = new ArrayList<>();
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

    public boolean deleteBook(Book book, Staff staff) throws NotAuthorizedForAction {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getBookList().contains(book.getItemId())) {
                getBookList().remove(book);
            }
            return true;
        }
        throw new NotAuthorizedForAction("You are not authorized to delete a book");
    }

    public ArrayList<Member> addMember(Member member) throws PhoneNumberNotValid {
        if (member.phoneNo.length() == 10) {
            getMemberList().add(member);
        } else {
            throw new PhoneNumberNotValid("This is not a valid Phone number");
        }
        return memberList;
    }

    public final boolean deleteMember(Staff staff, Member member) throws NotAuthorizedForAction {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getMemberList().contains(member.getLibraryCardId())) {
                getMemberList().remove(member);
            }
            return true;
        }
        throw new NotAuthorizedForAction("You are not authorized to delete member");
    }

    public boolean issue(Member member, Book book) throws BorrowingBookLimitOver {
        if (member.getAddIssuedBooks() >= 3) {
            throw new BorrowingBookLimitOver("You can't issue more than three books");
        } else {
            member.addIssuedBook(book);
            bookList.remove(book);
            return true;
        }
    }

    public boolean reissue(Member member, Book book) throws ReissueNotValid {
        try {
            int reissueCount = 0;
            if (this.issue(member, book) == true && reissueCount < 1) {
                this.issue(member, book); //reissuing is considered as issuing a book so,
                // it gives duplicate entry in issuedBook() and create Exception.
                // This will be taken care by collections--interface--set in next task
                reissueCount++;
                return true;
            }
            throw new ReissueNotValid("Reissue is allowed only once");
        } catch (BorrowingBookLimitOver e) {
            LOG.error("Your are exceeding borrowing book limit");
            return false;
        }
    }

    public boolean returnBook(Member member, Book book) {
        if (member.issuedBook.equals(book)) {
            bookList.add(book);
            member.issuedBook.remove(book);
            return true;
        }
        return false;
    }

    public static void searchBook(Book book) {
        Scanner sc = new Scanner(System.in);
        try {
            LOG.info("search by title");
            String searchTitle = sc.nextLine();
            if (searchTitle.isBlank()) {
                throw new InvalidInput("write title of book to search a book");
            }
            for (Book i : bookList) {
                if (book.getTitle().contains(searchTitle)) {
                    LOG.info("Search result:  " + book);
                }
            }
            LOG.info("no Book found");
        } catch (InvalidInput e) {
            LOG.info("Give valid search input");
        }
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