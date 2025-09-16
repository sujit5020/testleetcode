import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  // sort greed factors
        Arrays.sort(s);  // sort cookie sizes
        
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // cookie can satisfy this child
                i++;  // move to next child
            }
            j++; // always move to next cookie
        }
        
        return i; // number of content children
    }
}
