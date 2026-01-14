/*
Problem: Check Prime Number

Input:
- An integer n entered by the user

Output:
- Displays whether the number is prime or not

Approach:
- If n < 1, it is not prime
- Assume the number is prime
- Check divisibility from 2 to n-1
- If divisible, mark as not prime

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class PrimeNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println(n + " Is not prime.");
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Is a prime number.");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
