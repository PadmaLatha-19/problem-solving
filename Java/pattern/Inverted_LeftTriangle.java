/*
Problem: Inverted Left Triangle Star Pattern

Input:
- Integer n representing number of rows

Output:
- Inverted left-aligned triangle using '*'

Approach:
- Outer loop runs from n to 1 (reverse order)
- Inner loop runs from 1 to n
- Print '*' when (row + col > n), else print space

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class InvertedLeftTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {
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
