/*
 * Armstrong Number Checker
 *
 * Problem:
 * Check whether a given number is an Armstrong number.
 *
 * Approach:
 * 1. Count the number of digits in the number.
 * 2. Calculate the sum of each digit raised to the power of the digit count.
 * 3. Compare the calculated sum with the original number.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ArmstrongCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;
        double sum = 0;

        // Step 1: Count digits
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        temp = number;

        // Step 2: Sum of powers of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }

        // Step 3: Compare
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
