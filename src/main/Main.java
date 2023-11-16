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
<<<<<<< HEAD
        Library library = new Library();
        Library.printLibraryInfo();
        library.addMember(member1);
        System.out.println(member1);
=======
        for (Member i : member) {
            System.out.println(member);
        }
        Library.printLibraryInfo();
>>>>>>> ac0c2d13e3777ab1e98185ec5d48d72218d479d2
    }
}