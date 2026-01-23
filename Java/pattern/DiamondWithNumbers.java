/*
Problem: Number Diamond Pattern

Input:
- Integer n representing number of rows (half of the diamond)

Output:
- Diamond-shaped pattern using numbers

Approach:
- Upper half prints increasing numbers with leading spaces
- Lower half prints decreasing numbers with leading spaces
- Each row prints numbers from 1 to row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class NumberDiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
