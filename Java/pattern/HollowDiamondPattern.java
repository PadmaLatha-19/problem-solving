/*
Problem: Hollow Diamond Star Pattern

Input:
- Integer n representing the number of rows for the upper half

Output:
- Hollow diamond pattern using '*'

Approach:
- Print upper half with increasing rows
- Print lower half with decreasing rows
- Print '*' only at the borders of the diamond
- Print spaces elsewhere to keep the pattern hollow

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class HollowDiamondPattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Stars and hollow spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            // Leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Stars and hollow spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
