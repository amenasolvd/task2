import java.util.ArrayList;
import java.util.Vector;

public class Library {
    final String lib_name;
    final String address;
    final String phone;
    final String website;
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Magazine> magazineList = new ArrayList<>();
    ArrayList<Member> memberList = new ArrayList<>();
    ArrayList<Staff> staffList = new ArrayList<>();
    ArrayList<Newspaper> newspaper = new ArrayList<>();

    public Library(String lib_name, String address, String phone, String website ) {
        this.lib_name = lib_name;
        this.address = address;
        this.phone = phone;
        this.website = website;
       }

    //getters and setters
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

    //method to add member
    public ArrayList<Member>addMember(ArrayList<Member>memberList){
        this.memberList.add(member);
        return memberList;
    }

    //method to delete member
    public ArrayList<Member>deleteMember(ArrayList<Member> memberList){
        this.memberList.remove(new Member("","","","",""));
        return memberList;
    }
 }