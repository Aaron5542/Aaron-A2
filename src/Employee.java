import java.util.Objects;

public class Employee extends Person {

    private final String employeeID;
    private String department;

    public Employee() {
        super();
        this.employeeID = "Unknown";
        this.department = "Unknown";
    }

    public Employee(String name, String address, int age, String employeeID, String department) {
        super(name, address, age);
        if (employeeID == null || employeeID.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        this.employeeID = employeeID;
        this.department = department != null ? department : "Unknown";
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department != null ? department : "Unknown";
    }

    @Override
    public String toString() {
        return new StringBuilder("Employee{")
                .append("employeeID='").append(employeeID).append('\'')
                .append(", department='").append(department).append('\'')
                .append(", name='").append(getName()).append('\'')
                .append(", address='").append(getAddress()).append('\'')
                .append(", age=").append(getAge())
                .append('}').toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeID, employee.employeeID) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeID, department);
    }
}
