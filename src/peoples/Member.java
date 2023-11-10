package peoples;

import java.util.List;
import java.util.Objects;

import items.Book;

public class Member extends Person {

    double a = Math.random();
    int b = (int) (a + 1000);
    private int libraryCardId = b + 10;
    public List<Book> issuedBook;
    private int bookCount;

    public Member(String firstname, String lastname, String email, String phoneNo, int cardID) {
        super(firstname, lastname, email, phoneNo);
        libraryCardId = cardID;
    }

    public int getLibraryCardId() {
        return libraryCardId;
    }

    @Override
    public String getFirstname() {
        return null;
    }

    @Override
    public void setFirstname() {
    }

    @Override
    public String getLastname() {
        return null;
    }

    @Override
    public void setLastname() {
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail() {
    }

    @Override
    public String getPhoneNo() {
        return null;
    }

    public List<Book> addIssuedBook(Book book) {
        issuedBook.add(book);
        bookCount++;
        return issuedBook;
    }

    public int getAddIssuedBooks() {
        return bookCount;
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
                ", issuedBook=" + issuedBook +
                ", bookCount=" + bookCount +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}