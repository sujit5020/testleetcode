class Solution {
    public String largestOddNumber(String num) {
        // start from the last digit and move left
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // convert char to int
            if (digit % 2 == 1) { // check if odd
                return num.substring(0, i + 1); // take prefix up to this digit
            }
        }
        return ""; // no odd digit found
    }
}
