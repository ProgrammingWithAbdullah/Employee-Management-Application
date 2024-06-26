import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Enroll New Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Display Pay Slip");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee number: ");
                    int employeeNumber = scanner.nextInt();
                    System.out.print("Enter monthly wage: ");
                    double monthlyWage = scanner.nextDouble();
                    System.out.print("Enter tax rate (e.g., 0.2 for 20%): ");
                    double taxRate = scanner.nextDouble();
                    System.out.print("Enter national insurance rate (e.g., 0.1 for 10%): ");
                    double nationalInsuranceRate = scanner.nextDouble();
                    system.enrollEmployee(name, employeeNumber, monthlyWage, taxRate, nationalInsuranceRate);
                    break;
                case 2:
                    system.listEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee number: ");
                    int empNumber = scanner.nextInt();
                    system.displayPaySlip(empNumber);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}