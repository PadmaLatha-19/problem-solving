/*
Problem Statement:
Write a program to count the number of distinct absolute values in an array.

Input:
- An integer array (may contain positive and negative numbers)

Output:
- Number of distinct absolute values present in the array

Example:
Input:
[-1, 1, -2, 2, 3, -3, 4, 4]

Output:
Number of absolute distinct values: 4

Approach:
- Convert all elements in the array to their absolute values
- Sort the array
- Traverse the sorted array and count distinct elements by comparing
  the current element with the previous one

Time Complexity:
- O(N log N)  // due to sorting

Space Complexity:
- O(1)        // in-place modification (ignoring sort internals)
*/

import java.util.Arrays;

public class DistinctValue {

    public static void main(String[] args) {

        int[] arr = { -1, 1, -2, 2, 3, -3, 4, 4 };

        // Convert all elements to absolute values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }

        // Sort the array
        Arrays.sort(arr);

        // Count distinct values
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        System.out.println("Number of absolute distinct values: " + count);
    }
}
