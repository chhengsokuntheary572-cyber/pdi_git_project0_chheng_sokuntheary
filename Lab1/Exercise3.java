import java.util.Arrays;
import java.util.Scanner;

class MaxMin {
    int num1, num2, num3, num4, num5;;

    public MaxMin() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input: ");
            this.num1 = input.nextInt();
            this.num2 = input.nextInt();
            this.num3 = input.nextInt();
            this.num4 = input.nextInt();
            this.num5 = input.nextInt();
            System.out.print("     : ");
        }
    }

}

public class Exercise3 {
    public static void main(String[] args) {
        MaxMin numbers = new MaxMin();
        int[] nums = {numbers.num1, numbers.num2, numbers.num3, numbers.num4, numbers.num5};
        int max = nums[0];
        int min = nums[0];

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Output: ");
        System.out.println("Among all the five numbers" + Arrays.toString(nums)+ ", min is " + min + " max " + max + ".");
    }
}
