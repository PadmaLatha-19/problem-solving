/*
 * String Tokenization
 *
 * Approach:
 * 1. Read the input string.
 * 2. Trim leading and trailing spaces.
 * 3. If the string is empty, print 0.
 * 4. Split the string using non-alphabetic characters as delimiters.
 * 5. Print the number of tokens and each token on a new line.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        // Handle empty input
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
