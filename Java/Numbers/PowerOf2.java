/*
Problem Statement:
Write a program to check whether a given number is a power of 2.

Input:
- An integer N

Output:
- Prints whether the number is a power of 2 or not

Example:
Input:
8

Output:
8 is a power of 2.

Approach:
- A number is a power of 2 if it has exactly one set bit in binary
- For such numbers:
  N & (N - 1) = 0
- Also ensure N > 0

Time Complexity:
- O(1)

Space Complexity:
- O(1)
*/

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is NOT a power of 2.");
        }

        sc.close();
    }
}
