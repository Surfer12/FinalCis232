public class Alt1 {
    private String inputWord;
    private boolean isPalindrome;

    public static boolean PalindromeFunctionMethod(String str) {
        boolean isPalindrome = true; // Initialize as true
        char[] inputWordCharArray = str.toLowerCase().toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < inputWordCharArray.length / 2; i++) { // Check only half the array
            if (inputWordCharArray[i] != inputWordCharArray[inputWordCharArray.length - 1 - i]) {
                isPalindrome = false; // Set to false if mismatch found
                break; // Exit loop early if not a palindrome
            }
        }
        return isPalindrome;
    }
}
