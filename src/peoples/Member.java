package peoples;

import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

import items.Book;

public class Member extends Person {

    private final int libraryCardId;
    private TreeSet<Book> issuedBooks = new TreeSet<>();

    public Member(String firstname, String lastname, String email, String phoneNo, int cardId) {
        super(firstname, lastname, email, phoneNo);
        this.libraryCardId = new Random().nextInt(99999 - 10000) + 10000;
    }

    public int getLibraryCardId() {
        return libraryCardId;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNo() {
        return phoneNo;
    }

    public TreeSet<Book> addIssuedBook(Book book) {
        issuedBooks.add(book);
        return issuedBooks;
    }

    public int getAddIssuedBooks() {
        return issuedBooks.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return Objects.equals(getLibraryCardId(), member.getLibraryCardId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLibraryCardId());
    }

    @Override
    public String toString() {
        return "Member{" +
                "libraryCardId=" + libraryCardId +
                ", issuedBook=" + issuedBooks +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}