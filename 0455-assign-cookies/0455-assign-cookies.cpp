#include <vector>
#include <algorithm>

class Solution {
public:
    int findContentChildren(std::vector<int>& g, std::vector<int>& s) {
        // Sort the greed factors and the cookie sizes
        std::sort(g.begin(), g.end());
        std::sort(s.begin(), s.end());
        
        int child = 0;  // Pointer for the children
        int cookie = 0; // Pointer for the cookies
        
        // Try to satisfy as many children as possible
        while (child < g.size() && cookie < s.size()) {
            if (s[cookie] >= g[child]) {
                // If the current cookie can satisfy the current child
                child++;
            }
            // Move to the next cookie
            cookie++;
        }
        
        // The number of satisfied children
        return child;
    }
};
