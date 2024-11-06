package patterns.structural.adapter.creatingOurOwn;

public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public int getId() {
        return employeeCSV.getId();
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastlame();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
