/*
Problem: Check Whether a Number is a Perfect Number

Input:
- An integer number

Output:
- Displays whether the number is a Perfect number or not

Definition:
- A Perfect number is a number equal to the sum of its proper divisors
  (excluding the number itself).

Example:
- 6 → 1 + 2 + 3 = 6
- 28 → 1 + 2 + 4 + 7 + 14 = 28

Approach:
- Find all divisors of the number from 1 to n/2
- Sum the divisors
- Compare the sum with the original number

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num && num != 0) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
