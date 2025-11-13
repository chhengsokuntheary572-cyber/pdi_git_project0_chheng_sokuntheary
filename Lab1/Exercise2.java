import java.util.Scanner;
class Answer {
    float a, b, c;
    public void Calculate() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===================================================");
            System.out.println("Welcome to our program");
            System.out.println("'Quadratic Equation Solver ax^2 + bx + c = 0'");
            System.out.println("===================================================");
            System.out.println("");
            System.out.print("Input a: ");
            this.a = input.nextFloat();
            System.out.print("Input b: ");
            this.b = input.nextFloat();
            System.out.print("Input c: ");
            this.c = input.nextFloat();
            System.out.println("");
            System.out.println("---------------------------------------------------");
            float D = (b * b) - (4 * a * c);
            if (D > 0) {
                float x1 = (float) ((-b + Math.sqrt(D)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(D)) / (2 * a));
                System.out.println("Roots of this equation: " + a + "x^2 + " + b + "x + " + c + " are:");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            } else if (D == 0) {
                float x = -b / (2 * a);
                System.out.println("Roots of this equation: " + a + "x^2 + " + b + "x + " + c + " are:");
                System.out.printf("Root = %.2f\n", x);
            } else {
                System.out.println("Roots of this equation: " + a + "x^2 + " + b + "x + " + c + " are:");
                float realPart = -b / (2 * a);
                float imaginaryPart = (float) (Math.sqrt(-D) / (2 * a));
                System.out.printf("x1 = %.2f + %.2fi\n", realPart, imaginaryPart);
                System.out.printf("x2 = %.2f - %.2fi\n", realPart, imaginaryPart);
            }
        }
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        Answer equation = new Answer();
        equation.Calculate();
    }
}
