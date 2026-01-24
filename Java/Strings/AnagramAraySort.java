/*
Problem: Check Whether Two Strings Are Anagrams (Sorting Method)

Input:
- Two strings entered by the user

Output:
- "Anagrams" if both strings are anagrams
- "Not Anagrams" otherwise

Approach:
- Convert strings to lowercase and remove spaces
- Check if lengths are equal
- Convert strings to character arrays
- Sort both arrays
- Compare the sorted arrays

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class AnagramSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
