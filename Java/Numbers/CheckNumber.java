/*
Problem: Count Positive, Negative, and Zero Numbers

Input:
- A sequence of integers entered by the user
- User chooses whether to continue or stop

Output:
- Total count of positive numbers
- Total count of negative numbers
- Total count of zeros

Approach:
- Initialize counters for positive, negative, and zero values
- Use a while loop controlled by user choice
- Read a number and update respective counters
- Continue until user chooses to stop

Time Complexity: O(n), where n is the number of inputs
Space Complexity: O(1)
*/

import java.util.*;

public class CountNegative {
    public static void main(String[] args) {

        char choice = 'y';
        int positive = 0, negative = 0, zeros = 0;

        Scanner sc = new Scanner(System.in);

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.print("Enter y to continue, n to stop: ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
