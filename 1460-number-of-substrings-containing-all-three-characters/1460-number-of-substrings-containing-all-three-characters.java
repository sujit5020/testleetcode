class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3]; // for a, b, c
        int left = 0, res = 0;
        
        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;
            
            // shrink left until window still contains all three
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += (n - right); 
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        
        return res;
    }
}

