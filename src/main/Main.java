package main;

import items.*;
import main.exceptions.PhoneNoNotValidException;
import peoples.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(main.Main.class);

    public static void main(String[] args) throws PhoneNoNotValidException {
        Member member = new Member("amena","kureshi","amena.k@gmail.com","1565622665",1 );
        Staff[] staff = new Staff[2];
        Manager[] manager = new Manager[1];
        Librarian[] librarian = new Librarian[1];
        Item[] item = new Item[5];
        Book book1 = new Book("12345","Khalid Hussaini","Fiction","A thousand Splendid Suns",123,"");
        Book book2 = new Book("12345","Khalid Hussini","Fiction","A thousand Suns",1234,"");
        Magazine[] magazine = new Magazine[2];
        Newspaper[] newspaper = new Newspaper[1];
        Library library = new Library();
        library.addMember(member);
        library.addBook(book1);
        library.addBook(book2);
        Library.printAllBookInfo();
        Library.printAllMemberInfo();
        Library.printLibraryInfo();
    }
}