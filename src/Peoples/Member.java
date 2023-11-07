import java.util.List;

public class Member extends Person {
    private String libraryCardId;
    private int bookCount;

    public Member(String firstname, String lastname, String email_add, String phone_no, String cardID) {
        super(firstname, lastname, email_add, phone_no);
        libraryCardId = cardID;
    }

    public String getLibraryCardId() {
        return libraryCardId;
    }

    public void setLibraryCardId(String libraryCardId) {
        this.libraryCardId = libraryCardId;
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public String getPhoneNo() {
        return super.getPhoneNo();
    }

    @Override
    public String getEmailAdd() {
        return super.getEmailAdd();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Member)) {
            String phone = ((Member) object).getPhoneNo();
            if (phone != null && phone.equals(this.phoneNo)){
                System.out.println("This is registered member");
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.phoneNo.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname + "Phone number: : " + phoneNo
                + "Email Address:  " + emailAdd + "LibraryCard ID: " + libraryCardId;
    }
    
    public void addItem(Item item){
        List<Item>issuedItems = null;
        issuedItems.add(Item);
    }
    public int getIssuedBook(){

    }
    }