// Problem: Rotate an array to the left by one position
// Input: {5, 9, 6, 10, 12, 7, 3, 1, 4, 2}
// Output: {9, 6, 10, 12, 7, 3, 1, 4, 2, 5}
// Approach: Store first element and shift others left
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateLeft {
    public static void main(String[] args) {
        int[] A = {5, 9, 6, 10, 12, 7, 3, 1, 4, 2};
  
        for (int x : A) {
            System.out.print(x + " ");
        }

        System.out.println();
      
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int x : A) {
            System.out.print(x + " ");
        }
    }
}
