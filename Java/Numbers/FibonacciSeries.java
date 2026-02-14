/*
Problem Statement:
Write a program to print the Fibonacci series up to N terms.

Input:
- An integer N (number of terms)

Output:
- Prints the Fibonacci series up to N terms

Example:
Input:
5

Output:
0 1 1 2 3

Approach:
- Initialize first two Fibonacci numbers as 0 and 1
- Use a loop to generate the next number by summing the previous two
- Print each term as it is generated

Time Complexity:
- O(N)

Space Complexity:
- O(1)
*/

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
