/*
Problem: Hollow Number Pyramid Pattern

Input:
- Integer n representing number of rows

Output:
- Hollow number pyramid pattern

Approach:
- Use outer loop for rows
- Print leading spaces for pyramid alignment
- Print numbers on the borders (first & last column)
- Print full row of numbers for the last row
- Print spaces inside to form hollow structure

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class HollowNumberPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Numbers and hollow spaces
            for (int col = 1; col <= row; col++) {
                if (row == 1 || row == n || col == 1 || col == row) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
