public class inheritance2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.0, 2020, "ABC123");

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
        System.out.println("Start Year: " + employee.getStartYear());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
