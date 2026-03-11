/*
Problem: Count Even and Odd Numbers in an Array

Input:
- Size of the array
- Integer elements of the array

Output:
- Total number of even elements
- Total number of odd elements

Approach:
1. Read the array size from the user.
2. Store array elements using a loop.
3. Traverse the array.
4. Check each element using modulo (% 2).
5. If remainder is 0 → even number.
6. Otherwise → odd number.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class CountEvenOddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd numbers = " + oddCount);
    }
}
