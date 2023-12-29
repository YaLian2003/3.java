import java.util.Stack;  // Assuming OurStack uses java.util.Stack internally

public class PalindromeChecker {

    // Helper method to check if a character is punctuation
    private static boolean isPunctuation(char c) {
        // Implementation of isPunctuation (if not already provided)
        return !Character.isLetter(c);
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        OurStack<Character> stack = new OurStack<>();
        StringBuilder cleanStr = new StringBuilder();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            if (!isPunctuation(c) && !Character.isWhitespace(c)) {
                char lowerCaseChar = Character.toLowerCase(c);
                cleanStr.append(lowerCaseChar);
                stack.push(lowerCaseChar);  // Push onto the stack
            }
        }

        // Check if the characters are the same when popped from the stack
        for (int i = 0; i < cleanStr.length(); i++) {
            if (cleanStr.charAt(i) != stack.pop()) {
                return false;  // Not a palindrome
            }
        }
        return true;  // Is a palindrome
    }

    public static void main(String[] args) {
        // ... (Rest of your PalindromeChecker client program)
    }
}
