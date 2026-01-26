/*
Problem: Number X Pattern

Input:
- Integer n representing number of rows and columns (preferably odd)

Output:
- X-shaped pattern using numbers

Approach:
- Use two nested loops for rows and columns
- Print the row number when:
    - column equals row, OR
    - column equals (n - row + 1)
- Print space in all other positions
- Middle row prints only one number

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class NumberXPattern {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (col == row || col == n - row + 1) {
                    System.out.print(row);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
