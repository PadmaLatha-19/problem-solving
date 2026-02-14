/*
Problem Statement:
Write a program to print an X (cross) star pattern for a given value of N.

Input:
- An integer N (number of rows and columns)

Output:
- Prints an X pattern using '*' symbol

Example:
Input:
5

Output:
*   *
 * *
  *
 * *
*   *

Approach:
- Use two nested loops for rows and columns
- Print '*' when:
  - row == col (main diagonal)
  - row + col == n + 1 (secondary diagonal)
- Print space for all other positions

Time Complexity:
- O(N²)

Space Complexity:
- O(1)
*/

import java.util.Scanner;

public class XPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (row == col || row + col == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
