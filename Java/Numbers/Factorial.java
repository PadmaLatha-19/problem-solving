/*
Problem Statement:
Write a program to find the factorial of a given number.

Input:
- An integer N

Output:
- Factorial of the given number

Example:
Input:
5

Output:
Factorial of 5 is: 120

Approach:
- Initialize a variable `fact` to 1
- Use a loop from 1 to N
- Multiply `fact` with the loop variable in each iteration
- Print the final factorial value

Time Complexity:
- O(N)

Space Complexity:
- O(1)
*/

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();
    }
}
