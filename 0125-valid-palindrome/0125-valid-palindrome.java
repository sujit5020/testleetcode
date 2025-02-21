class Solution {
    public boolean isPalindrome(String s) {
        // Preprocess the string: remove non-alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        
        // Convert cleaned StringBuilder to String
        String cleanedStr = cleaned.toString();
        
        // Edge case: If cleaned string is empty, consider it a palindrome
        if (cleanedStr.isEmpty()) {
            return true;
        }
        
        // Start the recursive palindrome check
        return checkpallin(cleanedStr, 0);
    }

    private boolean checkpallin(String s, int i) {
        // Base case: If index reaches halfway, it's a palindrome
        if (i > s.length() / 2) return true;
        
        // Check characters at mirrored positions
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        
        // Recursive call to check the next pair of characters
        return checkpallin(s, i + 1);
    }
}
