/*
Problem: Find the Largest Digit in a Number

Input:
- An integer number entered by the user

Output:
- The largest digit present in the number

Approach:
1. Extract digits of the number using the modulo (%) operator.
2. Compare each digit with the current largest digit.
3. Update the largest value when a bigger digit is found.
4. Continue until the number becomes 0.

Time Complexity: O(d), where d is the number of digits
Space Complexity: O(1)
*/

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int largest = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit > largest)
                largest = digit;

            num = num / 10;
        }

        System.out.println("Largest digit = " + largest);
    }
}
