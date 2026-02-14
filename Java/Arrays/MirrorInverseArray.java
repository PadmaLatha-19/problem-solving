/*
Problem Statement:
Write a program to check whether a given array is a Mirror Inverse.

Definition:
An array is said to be a Mirror Inverse if:
arr[arr[i]] = i for all valid indices i.

Input:
- An integer N (size of array)
- N integer elements (0-based indexing)

Output:
- Prints whether the array is a Mirror Inverse or not

Example:
Input:
5
1 0 3 2 4

Output:
The array is a Mirror Inverse.

Approach:
- Traverse the array from index 0 to N-1
- For each index i, check:
  arr[i] < N and arr[arr[i]] == i
- If any condition fails, the array is not a Mirror Inverse

Time Complexity:
- O(N)

Space Complexity:
- O(1)
*/

import java.util.Scanner;

public class MirrorInverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isMirrorInverse = true;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0 || arr[i] >= n || arr[arr[i]] != i) {
                isMirrorInverse = false;
                break;
            }
        }

        if (isMirrorInverse) {
            System.out.println("The array is a Mirror Inverse.");
        } else {
            System.out.println("The array is NOT a Mirror Inverse.");
        }

        sc.close();
    }
}
