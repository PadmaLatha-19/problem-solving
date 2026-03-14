/*
Problem: Sort an Array using Selection Sort

Input:
- An integer array

Output:
- The sorted array in ascending order

Approach:
1. Assume the first element as the minimum.
2. Compare it with the remaining elements to find the smallest element.
3. Swap the smallest element with the current position.
4. Move to the next position and repeat the process.
5. Continue until the array is fully sorted.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
