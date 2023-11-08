package Peoples;

public abstract class Person {
        public String firstname;
        public String lastname;
        public String emailAdd;
        public String phoneNo;


   public Person (String firstname, String lastname, String emailAdd, String phoneNo){

    this.firstname = firstname;
    this.lastname = lastname;
    this.emailAdd = emailAdd;
    this.phoneNo = phoneNo;
    }

    public abstract String getFirstname();
    public abstract void setFirstname();
    public abstract String getLastname();
    public abstract void setLastname();
    public abstract String getEmailAdd();
    public abstract void setEmailAdd();
    public abstract String getPhoneNo();
    public abstract void setPhoneNo();
}