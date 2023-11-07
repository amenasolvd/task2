package Peoples;
import Items.Item;
import java.util.List;
import java.util.Objects;

import Main.Library;
import Items.Book;

public class Member extends Person {
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

    public void setLibraryCardId(String libraryCardId) {
        this.libraryCardId = libraryCardId;
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public String getPhoneNo() {
        return super.getPhoneNo();
    }

    @Override
    public String getEmailAdd() {
        return super.getEmailAdd();
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

    public void addIssuedBook(Book book){
        issuedBook.add(book);
    }
    public int getAddIssuedBooks(){
        return bookCount;
    }
}