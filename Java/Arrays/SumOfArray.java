// Problem: Sum of elements in an array
// Input: {1, 2, 3, 4}
// Output: 10
// Approach: Iterate and add elements
// Time Complexity: O(n)

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum);
    }
}
