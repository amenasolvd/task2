package main;

import Items.Book;
import Items.Magazine;
import Items.Newspaper;
import Peoples.Member;
import Peoples.Staff;
import java.util.ArrayList;
import java.util.Iterator;

public class Library{
    private static String libraryName = "Billerica Public Library";
    private static String website = "https://billericalibrary.org/";
    private static String address = "15 Concord Rd, Billerica, MA 01821";
    private static String phone = "(978) 671-0949";
    private static ArrayList<Book> bookList;
    private  static ArrayList<Magazine> magazineList;
    private static ArrayList<Member> memberList;
    private static ArrayList<Staff> staffList;
    private static ArrayList<Newspaper> newspaper;
    static{
        bookList = new ArrayList<>();
        magazineList = new ArrayList<>();
        memberList = new ArrayList<>();
        staffList = new ArrayList<>();
        newspaper = new ArrayList<>();
    }

    public Library(String libraryName, String address, String emailAdd, String phone, String website ) {

    }

    public static String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName() {
        return;
    }

    public static String getAddress() {
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

    public static void libraryInfo() {
        System.out.println("Library Name: " + libraryName + '\'' +
                "Library address: " + address + '\'' +
                "Phone Number: " + phone + "\'" +
                "Website: " + website + '\'');
        return;
    }

    @Override
    public String toString() {
        String total = "\n";
        for(int i = 0; i<memberList.size();i++){
            Member m = memberList.get(i);
            total = total + m.toString();
            System.out.println(total);
        }
        return total;
    }

    public static String allBookInfo() {
        String total = "\n";
        Iterator i = bookList.iterator();
        while(i.hasNext()){
            Book b = (Book)i.next();
            total = total+b;
            System.out.println(total);
            System.out.println("hello world");
        }
        return total;
    }
}