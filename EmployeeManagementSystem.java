import java.util.ArrayList;


class EmployeeManagementSystem {
    private ArrayList<Salary_Calculations> employees = new ArrayList<>();

    public void enrollEmployee(String name, int employeeNumber, double monthlyWage, double taxRate, double nationalInsuranceRate) {
        employees.add(new Salary_Calculations(name, employeeNumber, monthlyWage, taxRate, nationalInsuranceRate));
        System.out.println("Employee enrolled successfully.");
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees enrolled.");
        } else {
            System.out.println("List of Employees:");
            for (Salary_Calculations employee : employees) {
                System.out.println("Name: " + employee.getName() + ", Employee Number: " + employee.getEmployeeNumber());
                System.out.println("Gross Pay: $" + employee.getGrossPay());
                System.out.println("Net Pay: $" + employee.getNetPay());
                System.out.println("-------------------------");
            }
        }
    }

    public void displayPaySlip(int employeeNumber) {
        for (Salary_Calculations employee : employees) {
            if (employee.getEmployeeNumber() == employeeNumber) {
                System.out.println(employee.generatePaySlip());
                return;
            }
        }
        System.out.println("Employee with Employee Number " + employeeNumber + " not found.");
    }
}
