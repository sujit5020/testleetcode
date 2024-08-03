class Solution {
public:
    int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        // Determine the sign of the result
        bool sign = (dividend < 0) == (divisor < 0);

        // Use long to avoid overflow issues and take absolute values
        long n = labs(dividend);
        long d = labs(divisor);

        // Initialize quotient
        long quotient = 0;

        
        while (n >= d) {
            long temp = d, multiple = 1;
            while (n >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            n -= temp;
            quotient += multiple;
        }

        
        quotient = sign ? quotient : -quotient;

    
        if (quotient > INT_MAX) {
            return INT_MAX;
        }
        if (quotient < INT_MIN) {
            return INT_MIN;
        }

        return quotient;
    }
};
