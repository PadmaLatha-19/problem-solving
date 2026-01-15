/*
Problem: Inverted Right Triangle Star Pattern

Input:
- Integer n representing number of rows

Output:
- Inverted right-aligned triangle using '*'

Approach:
- Outer loop runs from n down to 1
- Inner loop prints '*' equal to current row value

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class InvertedRightTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
