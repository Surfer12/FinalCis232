

/**
 * This class provides a method to check if a given string is a palindrome using
 * the two pointers technique.
 * 
 * @author [Your Name]
 */
public class PalindromeFunctionTwoPointers {

    /**
     * Checks if the given string is a palindrome using the two pointers technique.
     * 
     * This method uses two pointers, one starting from the beginning and the other
     * from the end of the string.
     * It iterates through the string, skipping non-alphanumeric characters, and
     * checks if the characters at the pointers match.
     * If they do not match, it returns false. If the loop completes without finding
     * a mismatch, it returns true.
     * 
     * @param str The string to check for palindrome.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindromeTwoPointers(String str) {
        if (str == null)
            return false; // Return false if the input string is null
        int left = 0; // Initialize the left pointer at the start of the string
        int right = str.length() - 1; // Initialize the right pointer at the end of the string
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left)))
                left++;
            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right)))
                right--;

            if (str.charAt(left) != str.charAt(right)) {
                return false; // Return false if characters at the pointers do not match
            }
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
        return true; // Return true if all characters matched
    }
}