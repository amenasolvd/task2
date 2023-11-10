package peoples;

public class Staff extends Person {

    private double a = Math.random();
    private int b = (int) (a + 1000);
    private int employeeID = b;
    private String designation;
    private String department;

    public Staff(String firstname, String lastname, String email, String phoneNo,
                 int employeeID, String designation, String department) {
        super(firstname, lastname, email, phoneNo);
        this.employeeID = employeeID;
        this.designation = designation;
        this.department = department;
    }

    public String getFirstname() {
        super.firstname = firstname;
        return firstname;
    }

    public void setFirstname() {
        super.firstname = firstname;
        return;
    }

    public String getLastname() {
        super.lastname = lastname;
        return lastname;
    }

    public void setLastname() {
        super.lastname = lastname;
        return;
    }

    public String getPhoneNo() {
        super.phoneNo = phoneNo;
        return phoneNo;
    }

    public void setPhoneNo() {
        super.phoneNo = phoneNo;
        return;
    }

    public String getEmail() {
        return super.email = email;
    }

    public void setEmail() {
        super.email = email;
        return;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}