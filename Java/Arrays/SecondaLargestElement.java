/*
Problem Statement:
Write a program to find the second largest element in an array.

Input:
- An integer array

Output:
- Second largest element in the array

Example:
Input:
[1, 2, 3, 4, 5]

Output:
Second largest number: 4

Approach:
- Initialize first and second maximum values
- Traverse the array once
- Update max and second max accordingly

Time Complexity:
- O(N)

Space Complexity:
- O(1)
*/

public class MaxElementArray {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i];
            }
        }

        System.out.println("Second largest number: " + max2);
    }
}
