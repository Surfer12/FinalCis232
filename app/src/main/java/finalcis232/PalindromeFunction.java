
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

import java.util.Scanner;
@SuppressWarnings("all")
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
