/*
Problem: Palindrome Number Pyramid Pattern

Input:
- Integer n representing number of rows

Output:
- Palindrome-shaped number pyramid

Approach:
- Print leading spaces to center the pyramid
- Print numbers in decreasing order from row to 1
- Print numbers in increasing order from 2 to row
- Use nested loops for structure

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class PalindromeNumberPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Decreasing numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Increasing numbers
            for (int num = 2; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
