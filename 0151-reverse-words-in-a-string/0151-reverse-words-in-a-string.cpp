class Solution {
public:
    string reverseWords(string s) {
        int n = s.size();
        
        // Step 1: Reverse the entire string
        std::reverse(s.begin(), s.end());
        
        int start = 0, end = 0;
        
        // Step 2: Reverse each word in the reversed string
        while (end < n) {
            while (end < n && s[end] != ' ') end++; // find end of a word
            std::reverse(s.begin() + start, s.begin() + end); // reverse the word
            start = ++end; // move to the start of the next word
        }
        
        // Step 3: Remove extra spaces
        int i = 0;
        start = 0;
        while (i < n) {
            // Skip leading spaces
            while (i < n && s[i] == ' ') i++;
            // Copy the word
            while (i < n && s[i] != ' ') s[start++] = s[i++];
            // Skip trailing spaces between words
            while (i < n && s[i] == ' ') i++;
            // Add a single space if there are more words
            if (i < n) s[start++] = ' ';
        }
        
        // Resize the string to remove trailing spaces
        s.resize(start);
        
        return s;
    }
};
