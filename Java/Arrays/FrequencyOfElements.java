/*
Problem: Find Frequency of Each Element in an Array

Input:
- An integer array entered by the user

Output:
- Frequency (count) of each unique element in the array

Approach:
- Use an auxiliary boolean array to track visited elements
- Traverse the array
- For each unvisited element, count its occurrences
- Mark counted elements as visited to avoid repetition

Time Complexity: O(n²)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
