class Solution {
    public String reverseWords(String s) {
        // trim removes leading and trailing spaces
        String[] words = s.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // iterate backwards
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
