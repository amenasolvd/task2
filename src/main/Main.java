package main;

import items.*;
import main.exceptions.PhoneNumberNotValid;
import peoples.*;

public class Main {

    public static void main(String[] args) throws PhoneNumberNotValid {
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
        System.out.println(member1);
    }
}