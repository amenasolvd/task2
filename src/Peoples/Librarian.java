package Peoples;

import java.util.ArrayList;
import Items.Magazine;
import Items.Book;

public class Librarian extends Staff implements ILibrarian {

    private ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Magazine> magazineList = new ArrayList<>();
    private ArrayList<Member> memberList = new ArrayList<>();

    public Librarian(String firstname, String lastname, String email_add, String phone_no,
                     String employee_ID, String designation, String department) {

        super(firstname, lastname, email_add, phone_no, employee_ID, designation, department);
    }

    public Boolean issue(Member member, Book book) {
        if (member.getAddIssuedBooks() >= 3) {
        System.out.println("you can't issue this book");
        return false;
        } else {
        member.addIssuedBook(book);
        bookList.remove(book);
        return true;
        }
    }

    public Boolean reissue(Member member, Book book) {
        int reissueCount = 0;
        if(this.issue(member, book) == true && reissueCount < 1){
        reissueCount++;
        }
        this.issue(member,book);
        return true;
    }

    public Boolean returnBook(Member member, Book book) {
        if (member.issuedBook.equals(book)) {
            bookList.add(book);
            member.issuedBook.remove(book);
            return true;
        }
        return false;
    }
}