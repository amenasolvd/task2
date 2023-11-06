import java.util.ArrayList;
public class Librarian extends Staff {
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Magazine> magazineList = new ArrayList<>();
    ArrayList<Member> memberList = new ArrayList<>();
    int myBook = 0;

    public Librarian(String firstname, String lastname, String email_add, String phone_no, String employee_ID, String designation, String department) {
        super(firstname, lastname, email_add, phone_no, employee_ID, designation, department);
    }

    //method to issue book
    public Boolean issue() {
        Manager manager = new Manager("", "", "", "", "", "", "");
        Book book = new Book("", "", "", "", "", "");
        Member member = new Member("", "", "", "", "");
        if (member.libraryCardId == null) {
            return false;
        }
        if (myBook < 3) {
            manager.deleteBook(book);
            myBook++;
        }
        return true;

    }

    //getters and setters
    public int getMyBook() {
        return myBook;
    }

    public void setMyBook(int myBook) {
        this.myBook = myBook;
    }

    //method to reissue book
    public Boolean reissue(Member member, Book book) {
        if (this.issue() == true) {
            this.issue();
        }
        return true;
    }

    //method to reissue book
    public Boolean returnBook() {
        if (this.issue() == true) {
            Manager manager = new Manager("", "", "", "", "", "", "");
            Book book = new Book("", "", "", "", "", "");
            Member member = new Member("", "", "", "", "");
            manager.addBook(book);
            this.myBook--;
            return true;
        } else {
            return false;
        }
    }
}