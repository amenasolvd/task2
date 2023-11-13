package peoples;

import java.lang.String;

public final class Manager extends Staff {

    public Manager(String firstname, String lastname, String email, String phoneNo,
                   int employeeID, String designation, String department) {
        super(firstname, lastname, email, phoneNo, employeeID, designation, department);
    }
}