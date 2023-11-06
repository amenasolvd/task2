public class Member extends Person {
    String libraryCardId;
    int myBooks;
    public Member(String firstname, String lastname, String email_add, String phone_no, String cardID) {
        super(firstname, lastname, email_add, phone_no);
        libraryCardId = cardID;
    }

    //getters and setters
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
    public String getPhone_no() {
        return super.getPhone_no();
    }

    @Override
    public String getEmail_add() {
        return super.getEmail_add();
    }
    //override equals method for member.phone_no

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Member)) {
            String phone = ((Member) object).getPhone_no();
            if (phone != null && phone.equals(this.phone_no)){
                System.out.println("This is registered member");
                return false;
            }
        }
        return true;
    }
    //overriding hashcode() for member.phone_no

    @Override
    public int hashCode() {
        return this.phone_no.hashCode();
    }

    //overriding toString method to get member details.
    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname + "Phone number: : " + phone_no
                + "Email Address:  " + email_add + "LibraryCard ID: " + libraryCardId;
    }

    }