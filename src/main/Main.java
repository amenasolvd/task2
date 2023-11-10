package main;

import items.*;
import peoples.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

    Member[] member = new Member[2];
    Staff[] staff = new Staff[2];
    Manager[] manager = new Manager[1];
    Librarian[] librarian = new Librarian[1];
    Item[] item = new Item[5];
    Book[] book = new Book[2];
    Magazine[] magazine = new Magazine[2];
    Newspaper[] newspaper = new Newspaper[1];
    Library library = new Library();
    for(Member i : member) {
         System.out.println(member);
    }
    Library.printLibraryInfo();
    log.debug("Debug Message Logged !!!");
    log.info("Info Message Logged !!!");
    log.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}