/*
Problem: Hourglass Star Pattern

Input:
- Integer n representing number of rows

Output:
- Hourglass-shaped star pattern

Approach:
- First half prints decreasing stars with increasing spaces
- Second half prints increasing stars with decreasing spaces
- Nested loops control spacing and stars

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class HourglassPattern {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int row = n; row >= 1; row--) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int row = 2; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
