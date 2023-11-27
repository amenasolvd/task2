package main;

import arraylist.CustomArrayList;
import exceptions.*;
import items.*;
import linkedlist.CustomLinkedList;
import peoples.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Library implements main.ILibrary {

    private static final Logger LOGGER = LogManager.getLogger(main.Library.class);
    private static final String libraryName = "Billerica Public Library";
    private static final String website = "https://billericalibrary.org/";
    private static final String address = "15 Concord Rd, Billerica, MA 01821";
    private static final String phone = "(978) 671-0949";
    private static CustomLinkedList<Book> bookList = new CustomLinkedList<>();
    private static CustomArrayList<Magazine> magazineList = new CustomArrayList<>();
    private static CustomLinkedList<Member> memberList = new CustomLinkedList<>();
    private static ArrayList<Staff> staffList = new ArrayList<>();
    private static Set<Newspaper> newspaperList = new HashSet<>();
    HashMap<Integer, TreeSet<Book>> assignBook = new HashMap<>();

    public Library() {
    }

    public CustomLinkedList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(CustomLinkedList<Member> memberList) {
        Library.memberList = memberList;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        Library.staffList = staffList;
    }

    public CustomLinkedList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(CustomLinkedList<Book> bookList) {
        Library.bookList = bookList;
    }

    public CustomArrayList<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(CustomArrayList<Magazine> magazineList) {
        Library.magazineList = magazineList;
    }

    public Set<Newspaper> getNewspaper() {
        return newspaperList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean deleteBook(Book book, Staff staff) throws NotAuthorizedException {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getBookList().contains(book)) {
                bookList.remove(book);
            }
            return true;
        }
        throw new NotAuthorizedException("You are not authorized to delete a book");
    }

    public void addMember(Member member) throws PhoneNoNotValidException {
        if (member.getPhoneNo().length() == 10) {
            memberList.add(member);
            LOGGER.info("member added");
        } else {
            throw new PhoneNoNotValidException("This is not a valid Phone number");
        }
    }

    public final boolean deleteMember(Staff staff, Member member) throws NotAuthorizedException {
        if (staff.getDesignation().equals("Manager")) {
            if (this.getMemberList().contains(member)) {
                getMemberList().remove(member);
            }
            return true;
        }
        throw new NotAuthorizedException("You are not authorized to delete member");
    }

    public boolean issue(Member member, Book book) throws BorrowingBookLimitOverException {
        if (member.getAddIssuedBooksCount() >= 3) {
            throw new BorrowingBookLimitOverException("You can't issue more than three books");
        } else {
            member.addIssuedBook(book);
            assignBook.put(member.getLibraryCardId(), member.addIssuedBook(book));
            bookList.remove(book);
            return true;
        }
    }

    public boolean reissue(Member member, Book book) throws ReissueNotValidException {
        try {
            int reissueCount = 0;
            if (assignBook.containsValue(book.getItemId()) && reissueCount < 1) {
                this.issue(member, book);
                reissueCount++;
                return true;
            }
            throw new ReissueNotValidException("Reissue is allowed only once");
        } catch (BorrowingBookLimitOverException | ReissueNotValidException e) {
            LOGGER.error("Your are exceeding borrowing book limit");
            return false;
        }
    }

    public boolean returnBook(Member member, Book book) {
        if (member.addIssuedBook(book).contains(book)) {
            assignBook.remove(book.getItemId(), member.getLibraryCardId());
            bookList.add(book);
            member.addIssuedBook(book).remove(book);
            return true;
        }
        return false;
    }

    public static void searchBook(Book book) {
        try (Scanner sc = new Scanner(System.in)) {
            LOGGER.info("search by title");
            String searchTitle = sc.nextLine();                         //This may throw exception if user don't put input
            for (Book i : bookList.getAll()) {
                if (book.getTitle().contains(searchTitle)) {
                    LOGGER.info("Search result:  " + book);
                }
            }
            LOGGER.info("no Book found");
        } catch (Exception e) {
            LOGGER.info("Give valid search input");
        }
    }

    public void addNewspaper(Newspaper newspaper) {
        try {
            Scanner sc = new Scanner(System.in);
            LOGGER.info("Enter name of newspaper");
            String newspaperTitle = sc.nextLine();
            LOGGER.info("Enter published of newspaper in yyyy/mm/dd format");
            String newsDate = sc.next();                                            //This might throw Exception
            LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newsDate);
            LocalDate date = LocalDate.parse(newsDate);
            if (date.isAfter(localDate)) {
                throw new InvalidInputException("Date is invalid");
            }
            newspaperList.add(newspaper);
        } catch (InvalidInputException e) {
            LOGGER.error("Enter Date in correct format ");
        }
    }

    public static void printLibraryInfo() {
        System.out.println("Library Name: " + libraryName + '\'' +
                "Library address: " + address + '\'' +
                "Phone Number: " + phone + '\'' +
                "Website: " + website + '\'');
    }

    public static void printAllBookInfo() {
        for (Book i : bookList.getAll()) {
            LOGGER.info("BookList : " + i);
        }
    }

    public static void printAllMemberInfo() {
        for (Member i : memberList.getAll()) {
            LOGGER.info("MemberList : " + i);
            System.out.println("MemberList : " + i);
        }
    }
}