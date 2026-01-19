/*
Problem: Check Whether a Character is a Vowel or Consonant

Input:
- A single character entered by the user

Output:
- Displays whether the character is a vowel, consonant, or invalid input

Approach:
- Read a character from the user
- Convert it to lowercase for uniform comparison
- Check against vowel characters
- Validate alphabet input using character range

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CheckForVowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}
