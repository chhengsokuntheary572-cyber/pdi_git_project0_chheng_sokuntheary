public class Student {
    private final int studentId;
    private final String name;
    private final int[] marks; // Array to hold marks for 5 subjects
    private final int totalMarks;
    private final double average;
    private final char grade;

    // Constructor
    public Student(int id, String name, int[] marks) {
        this.studentId = id;
        this.name = name;
        this.marks = marks;
        
        // Process: Calculate Total and Average
        this.totalMarks = calculateTotal();
        this.average = calculateAverage();
        
        // Process: Assign Grade
        this.grade = assignGrade(this.average);
    }
    
    // Helper to calculate total marks
    private int calculateTotal() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Helper to calculate average
    private double calculateAverage() {
        // Assuming 5 subjects were read, total possible marks is 500 (5 * 100)
        return (double) this.totalMarks / this.marks.length;
    }

    // Helper to assign grade based on average
    private char assignGrade(double avg) {
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 75) {
            return 'B';
        } else if (avg >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Output: Display all details
    public void displayDetails() {
        System.out.printf("| %-5d | %-20s | %-12d | %-10.2f | %-5c |\n", 
            studentId, name, totalMarks, average, grade);
    }
}