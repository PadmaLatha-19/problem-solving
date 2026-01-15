
/*
Problem: Remove Spaces from a String

Input:
- A string entered by the user

Output:
- The string after removing all spaces

Approach:
- Read the input string
- Traverse each character
- Append characters to result string if they are not spaces

Time Complexity: O(n), where n is the length of the string
Space Complexity: O(n)
*/

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String result = " ";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                result += input.charAt(i);
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
