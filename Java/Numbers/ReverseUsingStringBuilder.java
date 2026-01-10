// Problem: Reverse a given number using StringBuilder
// Input: 1234
// Output: 4321
// Approach: Convert the number to String, reverse it using StringBuilder
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {

        int num = 1234;

        // Convert integer to String and reverse it
        String reversedStr = new StringBuilder(String.valueOf(num))
                                .reverse()
                                .toString();

        System.out.println("The reversed number is: " + reversedStr);
    }
}
