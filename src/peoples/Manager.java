package peoples;

import java.lang.String;

public final class Manager extends Staff {

    public Manager(String firstname, String lastname, String email, String phoneNo,
                   int employeeID, String designation, String department) {
        super(firstname, lastname, email, phoneNo, employeeID, designation, department);
    }

    @Override
    public int getEmployeeID() {
        return super.getEmployeeID();
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail() {

    }
}