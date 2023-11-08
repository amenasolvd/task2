package Peoples;

//Peoples.Staff Class is child class of Peoples.Person Class
public class Staff extends Person {
    private String employee_Id;
    private String designation;
    private String department;
public Staff (String firstname, String lastname, String email_add,String phone_no,
              String employee_ID, String designation, String department) {
    super(firstname, lastname, email_add, phone_no);

    this.employee_Id = employee_ID;
    this.designation = designation;
    this.department = department;
}

    public String getFirstname() {
        super.firstname = firstname;
        return firstname;
    }

    public void setFirstname(){
        super.firstname = firstname;
        return;
    }

    public String getLastname() {
        super.lastname = lastname;
        return lastname;
    }

    public void setLastname(){
        super.lastname = lastname;
        return;
    }

    public String getPhoneNo() {
        super.phoneNo = phoneNo;
        return phoneNo;
    }

    public void setPhoneNo(){
        super.phoneNo = phoneNo;
        return;
    }

    public String getEmailAdd() {
        return super.emailAdd = emailAdd;
    }

    public void setEmailAdd(){
        super.emailAdd = emailAdd;
        return;
    }
}