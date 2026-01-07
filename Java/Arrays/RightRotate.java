// Problem: Rotate an array to the right by one position
// Input: {10, 20, 30, 40, 50}
// Output: {50, 10, 20, 30, 40}
// Approach: Store last element and shift others right
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateRight {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};

     
        for (int x : A) {
            System.out.print(x + " ");
        }

        System.out.println();

       
        int temp = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = temp;

       
        for (int x : A) {
            System.out.print(x + " ");
        }
    }
}
