package Peoples;

//Peoples.Staff Class is child class of Peoples.Person Class
public class Staff extends Person {
    final String employee_Id;
    final String designation;
    final String department;
public Staff (String firstname, String lastname, String email_add,String phone_no,
              String employee_ID, String designation, String department) {
    super(firstname, lastname, email_add, phone_no);
    this.employee_Id = employee_ID;
    this.designation = designation;
    this.department = department;
    }
}
