package peoples;

public abstract class Person {

    public String firstname;
    public String lastname;
    public String email;
    public String phoneNo;

    public Person (String firstname, String lastname, String email, String phoneNo){
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.phoneNo = phoneNo;
    }

    public abstract String getFirstname();
    public abstract void setFirstname();
    public abstract String getLastname();
    public abstract void setLastname();
    public abstract String getEmail();
    public abstract void setEmail();
    public abstract String getPhoneNo();
}