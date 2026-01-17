/*
Problem: Diamond Star Pattern

Input:
- Integer n = 6 (number of rows for the upper half)

Output:
- Diamond-shaped star pattern

Approach:
- First loop prints the upper half of the diamond
- Second loop prints the lower half
- Spaces are used for alignment
- Stars are printed with a trailing space for symmetry

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class DiamondPattern {
    public static void main(String[] args) {

        int n = 6;

        // Upper half
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
