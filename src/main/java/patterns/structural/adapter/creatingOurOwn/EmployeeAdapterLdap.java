package patterns.structural.adapter.creatingOurOwn;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap employeeFromLdap;


    public EmployeeAdapterLdap(EmployeeLdap employeeLdap){
    this.employeeFromLdap = employeeLdap;
    }

    @Override
    public int getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "employeeFromLdap=" + employeeFromLdap +
                '}';
    }
}
