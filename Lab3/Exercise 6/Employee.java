public class Employee {
    private final int employeeId;
    private final String name;
    private final double basicSalary;
    private final double grossSalary;

    // Constants for salary calculation
    private static final double HRA_RATE = 0.20; // 20%
    private static final double TCA_RATE = 0.10; // 10%

    // Constructor: Takes ID, Name, and Basic Salary
    public Employee(int id, String name, double basicSalary) {
        this.employeeId = id;
        this.name = name;
        this.basicSalary = basicSalary;

        // Calculate Gross Salary during object creation
        this.grossSalary = calculateGrossSalary(basicSalary);
    }

    // Method to calculate Gross Salary
    private double calculateGrossSalary(double basic) {
        double hra = basic * HRA_RATE;
        double tca = basic * TCA_RATE;
        return basic + hra + tca;
    }

    // Method to display all calculated details
    public void displayDetails() {
        System.out.printf("| %-4d | %-20s | $%-12.2f | $%-12.2f |\n", employeeId, name, basicSalary, grossSalary);
    }
}