package Hospital;

public abstract class HospitalEmployee {

    protected final String employeeNumber;
    protected final String name;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public HospitalEmployee(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public abstract int calculatePay();
}
