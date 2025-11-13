import java.util.Scanner;

class Number {
    int num;

    public Number() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            this.num = input.nextInt();
        }
    }

}

public class Exercise1 {
    public static void main(String[] args) {
        Number number = new Number();
        int n = number.num;

        if (n > 1000) {
            System.out.println("Please enter a number 1000 or less.");
        } else if (n < 0) {
            System.out.println("Please enter a positive number or zero.");
        } else {
            // Count from 1000 to the user’s number
            for (int i = 1000; i >= n; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
