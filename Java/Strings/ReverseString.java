// Problem: Reverse a given string
// Input: "Hello"
// Output: "olleH"
// Approach: Use StringBuilder reverse() method
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello";

        String reversedStr = new StringBuilder(str)
                                .reverse()
                                .toString();

        System.out.println("The reversed string is: " + reversedStr);
    }
}
