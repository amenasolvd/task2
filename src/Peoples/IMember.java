package Peoples;

import Items.Book;

public interface IMember {

    public String getFirstname();
    public String getLastname();
    public String getPhoneNo();
    public String getEmailAdd();
    public String getLibraryCardId();
    public void setLibraryCardId();
    public void addIssuedBook(Book book);
    public int getAddIssuedBooks();


}
