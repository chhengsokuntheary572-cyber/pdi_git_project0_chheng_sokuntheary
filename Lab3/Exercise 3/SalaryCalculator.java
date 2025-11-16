import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Use ArrayList to store employees
        List<Employee> employees = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("--- Employee Salary Calculator ---");

            // 1. Get number of employees (N)
            System.out.print("Enter the number of employees (N): ");
            int n = input.nextInt();
            input.nextLine(); // Consume newline

            // 2. Loop to get details for each employee
            for (int i = 1; i <= n; i++) {
                System.out.println("\n-- Entering details for Employee #" + i + " --");

                System.out.print("Enter Employee ID: ");
                int id = input.nextInt();
                input.nextLine(); // Consume newline

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Basic Salary: $");
                double basicSalary = input.nextDouble();
                input.nextLine(); // Consume newline

                // Create Employee object, which calculates Gross Salary automatically
                Employee emp = new Employee(id, name, basicSalary);
                employees.add(emp);
            }
        }

        // 3. Display Results
        System.out.println("\n=============================================================");
        System.out.println("              Employee Salary Report");
        System.out.println("=============================================================");

        // Print Header
        System.out.printf("| %-4s | %-20s | %-12s | %-12s |\n", 
            "ID", "Name", "Basic Salary", "Gross Salary");
        System.out.println("-------------------------------------------------------------");

        // Print Employee Details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
        System.out.println("=============================================================");
    }
}