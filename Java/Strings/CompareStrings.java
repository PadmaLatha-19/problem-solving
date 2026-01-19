/*
Problem: Compare Two Strings

Input:
- Two strings entered by the user

Output:
- Displays whether the strings are equal or not

Approach:
- Read two strings using Scanner
- Compare strings using equals() method
- Print result based on comparison

Time Complexity: O(n), where n is the length of the strings
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
