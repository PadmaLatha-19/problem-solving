/*
 * Problem: Check Whether a Number is a Neon Number
 *
 * Description:
 * A Neon Number is a number where the sum of the digits
 * of its square is equal to the original number.
 *
 * Example:
 * Input: 9
 * Square: 9 * 9 = 81
 * Sum of Digits: 8 + 1 = 9
 * Output: It is a Neon Number.
 *
 * Approach:
 * 1. Find the square of the given number.
 * 2. Extract each digit of the square using modulo (% 10).
 * 3. Add the digits to calculate their sum.
 * 4. Compare the sum with the original number.
 * 5. If both are equal, the number is a Neon Number.
 *
 * Time Complexity: O(log n²) ≈ O(log n)
 * Space Complexity: O(1)
 */

public class NeonNumber {

    public static void main(String[] args) {

        int n = 9;
        int num = n * n;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        if (n == sum) {
            System.out.println("It is a Neon Number.");
        } else {
            System.out.println("Not a Neon Number.");
        }
    }
}
