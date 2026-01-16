/*
 Problem Statement:
 Demonstrate all commonly used StringBuilder operations in Java.

 Operations Covered:
 1. append()
 2. insert()
 3. delete()
 4. deleteCharAt()
 5. replace()
 6. reverse()
 7. charAt()
 8. setCharAt()
 9. length()
 10. capacity()
 11. substring()
 12. toString()

 Approach:
 - Create a StringBuilder object
 - Apply each method step by step
 - Print output after every operation

 Time Complexity:
 Most operations run in O(n)

 Space Complexity:
 O(n)
*/

public class StringBuilderOperations {
    public static void main(String[] args) {

        // 1. Create StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Initial String: " + sb);

        // 2. append() – Add text at the end
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // 3. insert() – Insert text at a specific index
        sb.insert(4, " is");
        System.out.println("After insert: " + sb);

        // 4. delete() – Remove a range of characters
        sb.delete(4, 7); // removes " is"
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt() – Remove character at index
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt: " + sb);

        // 6. replace() – Replace part of the string
        sb.replace(5, 16, "Language");
        System.out.println("After replace: " + sb);

        // 7. reverse() – Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 8. charAt() – Access character at index
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // 9. setCharAt() – Modify character at index
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. length() – Get length
        System.out.println("Length: " + sb.length());

        // 11. capacity() – Internal buffer size
        System.out.println("Capacity: " + sb.capacity());

        // 12. substring() – Extract part of string
        String sub = sb.substring(0, 4);
        System.out.println("Substring (0 to 4): " + sub);

        // 13. toString() – Convert to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}
