/*
 * Problem: Convert Array to Wave Form
 *
 * Description:
 * Given an array, convert it into wave form such that:
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] ...
 *
 * Input:
 * arr = {1, 2, 3, 4, 5, 6}
 *
 * Output:
 * 2 1 4 3 6 5
 *
 * Approach:
 * 1. Traverse the array with a step of 2.
 * 2. Swap every adjacent pair of elements:
 *      (0,1), (2,3), (4,5), ...
 * 3. Print the modified array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ArrayWaveForm {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
