/*
Problem: Find Common Elements Between Two Arrays

Input:
- Two integer arrays a and b

Output:
- Prints the common elements present in both arrays

Approach:
- Traverse each element of array a
- Compare it with every element of array b
- If a match is found, print the element and break inner loop

Time Complexity: O(n × m),
  where n is the length of array a and m is the length of array b
Space Complexity: O(1)
*/

public class CommonElementArray {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};
        int[] b = {15, 20, 30, 50};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i]);
                    break;
                }
            }
        }
    }
}
