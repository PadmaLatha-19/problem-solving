/*
Problem: Pascal's Triangle (Simple)

Input:
- Integer n = 5 (number of rows)

Output:
- Pascal’s Triangle up to n rows

Approach:
- Use outer loop for rows
- Print leading spaces for triangle shape
- Use binomial coefficient logic:
  num = num * (row - col) / (col + 1)

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class PascalsTriangleSimple {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= n - row; col++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}
