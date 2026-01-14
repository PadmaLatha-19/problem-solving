/*
Problem: Right Triangle Star Pattern

Input:
- Integer n = 5 (number of rows)

Output:
- Right-aligned triangle using '*'

Approach:
- Outer loop controls rows
- Inner loop prints '*' equal to row number

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class RightTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
