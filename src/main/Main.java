package main;

import items.*;
import main.exceptions.PhoneNoNotValidException;
import peoples.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(main.Main.class);

    public static void main(String[] args) throws PhoneNoNotValidException {
        Member member1 = new Member("amena","kureshi","amena.k@gmail.com","1565622665",1 );
        Staff[] staff = new Staff[2];
        Manager[] manager = new Manager[1];
        Librarian[] librarian = new Librarian[1];
        Item[] item = new Item[5];
        Book[] book = new Book[2];
        Magazine[] magazine = new Magazine[2];
        Newspaper[] newspaper = new Newspaper[1];
        Library library = new Library();
        Library.printLibraryInfo();
        library.addMember(member1);
        LOGGER.info("details of Member",member1);
        Library.printLibraryInfo();
    }
}