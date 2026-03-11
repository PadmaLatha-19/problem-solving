/*
Problem: Linear Search in an Array

Input:
- Number of elements in the array
- Array elements
- Element to search (key)

Output:
- Position of the element if found
- Otherwise display "Element not found"

Approach:
1. Read the size of the array.
2. Store array elements using a loop.
3. Take the element to search from the user.
4. Traverse the array and compare each element with the key.
5. If a match is found, print the position and stop the search.
6. If the loop finishes without finding the element, display "Element not found".

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
