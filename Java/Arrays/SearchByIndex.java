/*
Problem: Linear Search in an Array

Input:
- An integer key entered by the user

Output:
- Index of the element if found

Approach:
- Traverse the array
- Compare each element with the key
- Print the index when a match is found

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int key = sc.nextInt();

        int A[] = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < A.length; i++) {
            if(A[i] == key) {
                System.out.println("Element found at index: " + i);
            }
        }
    }
}
