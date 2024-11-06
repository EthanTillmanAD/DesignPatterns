package patterns.structural.adapter.creatingOurOwn;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB(1234, "John", "Wick", "John@wick.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap(4456, "Han", "Solo", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("556, Indiana, Jones, indiana@jones.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));


        return employees;

    }

}
