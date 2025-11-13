import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input: ");
                String date = input.nextLine();

                String[] parts = date.split("-");

                if (parts.length != 3) {
                    System.out.println("Output: invalid");
                    continue;
                }

                int month, day;
                try {
                    Integer.valueOf(parts[0]);
                    month = Integer.parseInt(parts[1]);
                    day = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Output: invalid");
                    continue;
                }
                if (month < 1 || month > 12) {
                    System.out.println("Output: invalid");
                    continue;
                }
                int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (day < 1 || day > daysInMonth[month - 1]) {
                    System.out.println("Output: invalid");
                    continue;
                }

                System.out.println("Output: valid");
            }
        }
    }
}
