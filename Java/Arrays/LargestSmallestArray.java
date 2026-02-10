/*
Problem: Find the Largest and Smallest Element in an Array

Input:
- An integer array

Output:
- The largest and smallest elements in the array

Approach:
- Assume the first element as both largest and smallest
- Traverse the array and update largest and smallest values
- Print the results

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
