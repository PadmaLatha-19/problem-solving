/*
Problem: Count the Number of Digits in an Integer

Input:
- An integer number

Output:
- Total number of digits in the given integer

Approach:
- Read the integer input
- Handle the special case when the number is 0
- Repeatedly divide the number by 10
- Increment a counter for each division

Time Complexity: O(n), where n is the number of digits
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;

        // Special case for 0
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
