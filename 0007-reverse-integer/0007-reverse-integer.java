class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 if overflow occurs
            }
            rev=rev*10+digit;
            temp/=10;
            
        }
        return rev;
    }
}