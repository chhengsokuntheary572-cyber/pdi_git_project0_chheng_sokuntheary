import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCalculator {

    private static final int NUM_SUBJECTS = 5;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("--- Student Grade Calculation Program ---");

            // 1. Get number of students (N)
            System.out.print("Enter the number of students (N): ");
            int n = input.nextInt();
            input.nextLine(); // Consume newline

            // 2. Loop to get details for each student
            for (int i = 1; i <= n; i++) {
                System.out.println("\n-- Entering details for Student #" + i + " --");

                System.out.print("Enter Student ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Student Name: ");
                String name = input.nextLine();

                int[] marks = new int[NUM_SUBJECTS];
                System.out.println("Enter marks for " + NUM_SUBJECTS + " subjects (out of 100 each):");

                // Input 5 subject marks
                for (int j = 0; j < NUM_SUBJECTS; j++) {
                    System.out.print("  Mark for Subject " + (j + 1) + ": ");
                    marks[j] = input.nextInt();
                }
                input.nextLine(); // Consume newline after mark inputs

                // Create Student object, which performs calculations and assigns the grade
                Student student = new Student(id, name, marks);
                students.add(student);
            }
        }

        // 3. Output: Display Results
        System.out.println("\n=========================================================================");
        System.out.println("                          Student Grade Report");
        System.out.println("=========================================================================");

        // Print Header
        System.out.printf("| %-5s | %-20s | %-12s | %-10s | %-5s |\n", 
            "ID", "Name", "Total Marks", "Average", "Grade");
        System.out.println("-------------------------------------------------------------------------");

        // Print Student Details
        for (Student student : students) {
            student.displayDetails();
        }
        System.out.println("=========================================================================");
    }
}