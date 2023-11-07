import java.util.ArrayList;
import java.lang.String;
/* Description: class constructor for Manager, does not require any additional parameters
   beyond the parent class */
public class Manager extends Staff {

    Manager(String firstname, String lastname, String email_add,String phone_no, String employee_ID, String designation, String department) {
        super(firstname, lastname, email_add, phone_no, employee_ID, designation, department);
    }

    //method to add new book
    public void addBook(Book book){

        ArrayList<Book>bookList = new ArrayList<>();
        bookList.add(new Book("","","","","",""));
    }

    //method to delete book by using book.item_Id
    public void deleteBook(Book book){
        book.getItem_Id();
        ArrayList<Book>bookList = new ArrayList<>();
        if (book.getItem_Id().equals(book.item_Id)){
            bookList.remove(new Book("", "", "", "", "", ""));
        }
    }
}