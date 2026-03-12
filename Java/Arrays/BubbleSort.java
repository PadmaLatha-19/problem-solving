/*
Problem: Sort an Array using Bubble Sort

Input:
- Number of elements in the array
- Array elements

Output:
- Sorted array in ascending order

Approach:
1. Read the size of the array.
2. Store array elements.
3. Use Bubble Sort algorithm:
      - Compare adjacent elements.
      - Swap them if they are in the wrong order.
      - Repeat for n-1 passes.
4. After each pass, the largest element moves to its correct position.
5. Print the sorted array.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
