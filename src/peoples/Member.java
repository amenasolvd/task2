package peoples;

import java.util.List;
import java.util.Objects;

import items.Book;

public class Member extends Person {

    private int libraryCardId;
    public List<Book> issuedBook;

    public Member(String firstname, String lastname, String email, String phoneNo, int cardId) {
        super(firstname, lastname, email, phoneNo);
        double a = Math.random();
        int b = (int) (a + 1000);
        cardId = b+10;
        this.libraryCardId = cardId;
    }

    public int getLibraryCardId() {
        return libraryCardId;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
       this.email = email;
    }

    @Override
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public List<Book> addIssuedBook(Book book) {
        issuedBook.add(book);
        return issuedBook;
    }

    public int getAddIssuedBooks() {
        return issuedBook.size();
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
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}