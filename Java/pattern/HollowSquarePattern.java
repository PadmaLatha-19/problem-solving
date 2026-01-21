/*
Problem: Hollow Square Star Pattern

Input:
- Integer n representing number of rows and columns

Output:
- Hollow square pattern using '*'

Approach:
- Use two nested loops
- Print '*' for boundary rows and columns
- Print space for inner positions

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class HollowSquarePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
