/*
Problem: Left Triangle Star Pattern

Input:
- An integer n representing the number of rows

Output:
- A left-aligned triangle pattern made of '*'

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop controls columns
- Print '*' when (row + col > n), else print space

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class LeftTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col > n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
