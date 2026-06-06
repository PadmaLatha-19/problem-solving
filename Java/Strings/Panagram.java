/*
Problem: Check if a String is a Pangram

Input:
"The quick brown fox jumps over the lazy dog"

Output:
Pangram

Approach:
1. Convert string to lowercase.
2. Store all alphabet characters in a HashSet.
3. If set size is 26, it's a Pangram.

Time Complexity: O(n)
Space Complexity: O(26) ≈ O(1)
*/

import java.util.HashSet;

public class PangramCheck {

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toLowerCase().toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        if (set.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
