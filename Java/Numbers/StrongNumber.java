/*
Problem: Check Whether a Number is a Strong Number

Input:
- An integer number

Output:
- "Strong Number" if the sum of factorials of its digits equals the number
- Otherwise "Not Strong"

Definition:
- A Strong Number is a number where the sum of factorials of its digits
  equals the original number.

Example:
145 = 1! + 4! + 5! = 1 + 24 + 120 = 145

Approach:
1. Read the number from the user.
2. Extract each digit using modulo (%).
3. Compute factorial of each digit.
4. Add factorial values.
5. Compare the sum with the original number.

Time Complexity: O(d * d) where d is number of digits
Space Complexity: O(1)
*/

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong");
    }
}
