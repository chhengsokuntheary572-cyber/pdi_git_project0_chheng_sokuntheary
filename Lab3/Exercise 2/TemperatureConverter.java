import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Initialize the Scanner object to read input from the console
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Celsius to Fahrenheit Converter ---");

            // 1. Input N (number of cities/conversions)
            System.out.print("Enter the number of cities (N): ");
            int n = sc.nextInt();

            System.out.println("\n--- Starting Conversions ---");

            // 2. Loop N times
            for (int i = 0; i < n; i++) {

                // Input Celsius temperature
                System.out.print("City " + (i + 1) + " Celsius temp: ");
                double celsius = sc.nextDouble();

                // Process: Conversion formula F = (C * 9/5) + 32
                double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                // Note: Using 9.0/5.0 ensures floating-point division

                // Output: Display both temperatures
                System.out.printf("C: %.2f | F: %.2f\n", celsius, fahrenheit);
            }

            System.out.println("\n--- Conversions Complete ---");
        }
    }
}