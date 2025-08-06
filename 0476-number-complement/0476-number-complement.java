class Solution {
    public int findComplement(int num) {
      int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;  // creates a mask with all 1's in the length of 
        }
        return ~num & mask;
    }
}