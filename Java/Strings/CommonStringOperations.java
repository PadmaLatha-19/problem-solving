// Problem: Perform common String operations without using StringBuilder
// Input: "Java"
// Output: Demonstrates append, insert, delete, replace, reverse, etc.
// Approach: Use String methods and substring manipulation
// Time Complexity: O(n) for most operations
// Space Complexity: O(n) due to creation of new String objects

public class StringOperationsWithoutBuilder {

    public static void main(String[] args) {

        String s = "Java";
        System.out.println("Initial String: " + s);

        // Append operation
        s = s + " Programming";
        System.out.println("After append: " + s);

        // Insert operation
        s = s.substring(0, 4) + " is" + s.substring(4);
        System.out.println("After insert: " + s);

        // Delete operation
        s = s.substring(0, 4) + s.substring(7);
        System.out.println("After delete: " + s);

        // Delete character at specific index
        s = s.substring(0, 4) + s.substring(5);
        System.out.println("After deleteCharAt: " + s);

        // Replace operation
        s = s.replace("Programming", "Language");
        System.out.println("After replace: " + s);

        // Reverse string manually
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        s = reversed;
        System.out.println("After reverse: " + s);

        // charAt operation
        char ch = s.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // setCharAt simulation
        s = 'X' + s.substring(1);
        System.out.println("After setCharAt: " + s);

        // Length of string
        System.out.println("Length: " + s.length());

        // Substring operation
        String sub = s.substring(0, 4);
        System.out.println("Substring (0 to 4): " + sub);
    }
}
