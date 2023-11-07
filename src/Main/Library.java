package Main;

import Items.Item;
import Items.Book;
import Items.Magazine;
import Items.Newspaper;
import Peoples.Member;
import Peoples.Staff;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String libraryName;
    private final String address;
    private final String phone;
    private final String website;
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Magazine> magazineList = new ArrayList<>();
    ArrayList<Member> memberList = new ArrayList<>();
    ArrayList<Staff> staffList = new ArrayList<>();
    ArrayList<Newspaper> newspaper = new ArrayList<>();

    public Library(String libraryName, String address, String phone, String website) {

        this.libraryName = libraryName;
        this.address = address;
        this.phone = phone;
        this.website = website;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName() {
        return;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        return;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        return;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite() {
        return;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(ArrayList<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    public ArrayList<Newspaper> getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(ArrayList<Newspaper> newspaper) {
        this.newspaper = newspaper;
    }

    public void addMember(Member member) {
        this.memberList.add(member);
        return;
    }

    public void deleteMember(Member member) {
        this.memberList.remove(member);
        return;
    }

    public void libraryInfo() {
        System.out.println("Library Name: " + libraryName + '\'' +
                "Library address: " + address + '\'' +
                "Phone Number: " + phone + "\'" +
                "Website: " + website + '\'');
        return;
    }

    public void allBookInfo() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i));
        }
    }

 /*   public Book searchBookByName(Item item) {
        for (int i = 0; i < bookList.size(); i++) {
            if (item.getTitle().equals(bookList.get(i).getTitle())) {
                return bookList.get(i);
            }
        }
        return bookList;
    } */
}