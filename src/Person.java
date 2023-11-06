//Person Class is parent class for Member and Staff class
public class Person {
    String firstname;
    String lastname;
    final String email_add;
    final String phone_no;
   public Person (String firstname, String lastname, String email_add, String phone_no){
    this.firstname = firstname;
    this.lastname = lastname;
    this.email_add = email_add;
    this.phone_no = phone_no;
    }
    public String getFirstname(){
        this.firstname = firstname;
        return firstname;
    }
    public void setFirstname(){
        this.firstname = firstname;
    }

    public String getLastname(){
       return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail_add(){
       return email_add;
    }
    public String getPhone_no(){
        return phone_no;
    }

    public String setPhone_no(){
        return phone_no;
    }

}
