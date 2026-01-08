// Problem: Check whether a number is a palindrome
// Input: 121
// Output: true
// Input: -121
// Output: false
// Approach: Reverse the number and compare with original
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return reversed == temp;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
