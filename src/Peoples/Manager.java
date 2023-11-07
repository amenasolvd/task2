package Peoples;
import java.util.ArrayList;
import java.lang.String;
import Items.Book;
import Items.Item;
import Main.Library;
public class Manager extends Staff {

    public Manager(String firstname, String lastname, String email_add,String phone_no,
            String employee_ID, String designation, String department) {

        super(firstname, lastname, email_add, phone_no, employee_ID, designation, department);
    }

    public void addBook(Library library, Book book){
        library.getBookList().add(book);
    }

    public void deleteBook(Book book, Library library){
        book.getItemId();
        if (book.getItemId().equals(library.getBookList())){
        library.getBookList().remove(book);
        return;
        }
    }
}