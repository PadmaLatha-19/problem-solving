/*
Problem: Check Whether Two Strings Are Anagrams (Counting Method)

Input:
- Two strings entered by the user

Output:
- "Anagrams" if both strings are anagrams
- "Not Anagrams" otherwise

Approach:
- Convert strings to lowercase and remove spaces
- Check if lengths are equal
- Use an integer array of size 26 to count characters
- Increment count for first string
- Decrement count for second string
- If all counts are zero, strings are anagrams

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class AnagramCheck {
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

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}
