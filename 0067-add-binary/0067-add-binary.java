class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;  // pointer for string a
        int j = b.length() - 1;  // pointer for string b
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';  // convert char to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);   // binary digit
            carry = sum / 2;          // carry for next bit
        }

        return result.reverse().toString();  // reverse to get correct order
    }
}
