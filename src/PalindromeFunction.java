
/* Write a Java function that takes a single word as input and determines if it is a palindrome. A palindrome word is a word that reads the same backward as forward (ignoring capitalization). The function should return a Boolean.

Example:
Input: "Racecar"
Output: true
Input: "Hello"
Output: false
What is the time complexity of your approach? Explain your reasoning.

Rubric:

Approach Correctness (20%):
The approach correctly identifies palindromes.

Code Style (15%):
The code is well-formatted, easy to read and complete
The code uses meaningful variable names and includes comments where appropriate.

Time Complexity (5%):
The answer accurately describes the time complexity of the chosen approach.
The reasoning behind the time complexity analysis is clearly explained. */
import java.util.*; // Necessary import statements for scanner, charArray, 
import java.util.Scanner;

public class PalindromeFunction {
    private String inputWord; // Initalizes inputWord variable
    boolean isPalindrome; // Initalizes boolean isPalindrome

    public static boolean PalindromeFunctionMethod() {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        boolean isPalindrome = true;
        char[] inputWordCharArray = inputWord.toLowerCase().toCharArray();
        for (int i = 0; i < inputWordCharArray.length - 1; i++) { // O(n) time complexity for outer for loop
            for (int j = inputWordCharArray.length - 1; j > i; j--) { // O(n) time complexity for inner for loop
                if (inputWordCharArray[i] != inputWordCharArray[j]) {
                    isPalindrome = false;
                    break;
                }
            }

        } // Total time complexity O(n^2), nested for loop where outer loop iterates
          // through each character in the character array checking against inner loop
          // which iterates backwards through the array checking for if the characters are
          // equal to eachother
        return isPalindrome;
    }

}

    // Remove string from the input parameter
    // Use of pointers, rather than nested for loops

    // Improved version The optimized version will use two pointers to check for
    // palindromes in

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        int left = 0;
        int right = str.length() - 1;
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        while (left < right) {
            // Skip non-alphanumeric characters (if considering such cases)
            while (left < right && !Character.isLetterOrDigit(str.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(str.charAt(right)))
                right--;

            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match
            }
            left++; // Move rightward
            right--; // Move leftward
        }
        return true; // All characters matched
    }

    /*
     * ###Explanation:-**Two Pointers**:
     * One pointer starts at the beginning (`left`) and the other at the end
     * (`right`) of the string.
     * 
     * - **Loop**: The loop continues until the two pointers meet in the middle.
     * - **Character Check**: If characters at the pointers do not match, it returns
     * `false`.
     * - **Skipping Non-Alphanumeric**: If considering palindromes with only
     * alphanumeric characters, it skips other characters.
     * - **Time Complexity**: \(O(n)\) where `n` is the length of the string, as
     * each character is checked at most twice.
     * - **Space Complexity**: \(O(1)\) since no additional space is used
     * proportional to the input size.
     * 
     * This method is more efficient and adheres to the problem constraints more
     * strictly, providing a clear and concise solution to checking palindromes.
     */

 {
    "Two Pointer Technique in LinkedList": {
        "prefix": "twopointerlinkedlist",
        "body": [
            "class ListNode {",
            "    int val;",
            "    ListNode next;",
            "    ListNode(int x) { val = x; }",
            "}",
            "",
            "public static boolean hasCycle(ListNode head) {",
            "    if (head == null) return false;",
            "    ListNode slow = head;",
            "    ListNode fast = head.next;",
            "    while (fast != null && fast.next != null) {",
            "        if (slow == fast) return true; // Cycle detected",
            "        slow = slow.next; // Move slow pointer by 1",
            "        fast = fast.next.next; // Move fast pointer by 2",
            "    }",
            "    return false; // No cycle found",
            "}"
        ],
        "description": "Check if a linked list has a cycle using two-pointer technique."
    }
}