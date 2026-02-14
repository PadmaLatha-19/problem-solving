/*
Problem Statement:
Write a program to find the factorial of a number using recursion.

Input:
- An integer N

Output:
- Factorial of the given number
- Displays an error message for negative numbers

Example:
Input:
5

Output:
Factorial of entered number is: 120

Approach:
- If the number is negative, factorial is not defined
- Use a recursive function where:
  - Base case: factorial(0) = factorial(1) = 1
  - Recursive case: factorial(n) = n * factorial(n - 1)

Time Complexity:
- O(N)

Space Complexity:
- O(N)  // due to recursive call stack
*/

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("Factorial of entered number is: " + result);
        }

        sc.close();
    }

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
