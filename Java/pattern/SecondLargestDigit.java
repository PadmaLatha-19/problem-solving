/*
Problem: Find the Second Largest Digit in a Number

Input:
- An integer number entered by the user

Output:
- The second largest digit present in the number

Approach:
1. Extract digits using modulo (%) operation.
2. Keep track of the largest and second largest digits.
3. Update values while traversing the digits.
4. Ensure the second largest digit is different from the largest.

Time Complexity: O(d), where d is the number of digits
Space Complexity: O(1)
*/

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;

        while (num > 0) {

            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num = num / 10;
        }

        System.out.println("Second largest digit = " + secondLargest);
    }
}
