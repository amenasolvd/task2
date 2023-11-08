package Peoples;
import java.util.List;
import java.util.Objects;
import Items.Book;

public class Member extends Person implements IMember {
    private String libraryCardId;
    private int bookCount;
    List<Book>issuedBook;
    public Member(String firstname, String lastname, String email_add, String phone_no, String cardID) {
        super(firstname, lastname, email_add, phone_no);

        libraryCardId = cardID;
    }

    public String getLibraryCardId() {
        return libraryCardId;
    }

    @Override
    public void setLibraryCardId() {
        this.libraryCardId = libraryCardId;
    }

    @Override
    public String getFirstname() {
        super.firstname = firstname;
        return firstname;
    }

    public void setFirstname(){
        super.firstname = firstname;
        return;
    }

    public String getLastname() {
        super.lastname = lastname;
        return lastname;
    }

    public void setLastname(){
        super.lastname = lastname;
        return;
    }

    public String getPhoneNo() {
        super.phoneNo = phoneNo;
        return phoneNo;
    }

    public void setPhoneNo(){
        super.phoneNo = phoneNo;
        return;
    }

    public String getEmailAdd() {
        return super.emailAdd = emailAdd;
    }

    public void setEmailAdd(){
        super.emailAdd = emailAdd;
        return;
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

    public void addIssuedBook(Book book) {
        issuedBook.add(book);
    }

    public int getAddIssuedBooks(){
        return bookCount;
    }
}