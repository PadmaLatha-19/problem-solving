/*
 * Armstrong Digit Counter
 *
 * Problem:
 * Count the number of Armstrong digits in a given number.
 * Armstrong digits are considered as digits of the Armstrong number 153.
 *
 * Approach:
 * 1. Extract each digit from the number.
 * 2. Check whether it belongs to {1, 3, 5}.
 * 3. Count and print the total.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ArmstrongDigitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 1 || digit == 3 || digit == 5) {
                count++;
            }
            number /= 10;
        }

        System.out.println(count);
    }
}
