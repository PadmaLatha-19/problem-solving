/*
Problem: Print Substring from a Given String

Input:
- A string S
- Two integers start and end representing index positions

Output:
- Substring of S from index start to end (inclusive)

Approach:
- Read the string and indices
- Use substring(start, end + 1) since Java substring excludes the end index

Time Complexity: O(n), where n is the length of the substring
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(S.substring(start, end + 1));
    }
}
