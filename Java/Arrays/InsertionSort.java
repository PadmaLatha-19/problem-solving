/*
Problem: Sort an Array using Insertion Sort

Input:
- An integer array

Output:
- The sorted array in ascending order

Approach:
1. Start from the second element of the array.
2. Store the current element as 'key'.
3. Compare the key with elements before it.
4. Shift elements that are greater than the key one position ahead.
5. Insert the key at its correct position.
6. Repeat until the array becomes sorted.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1};
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
