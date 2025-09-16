class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int point : cardPoints) {
            total += point;
        }

        // If we take all cards
        if (k == n) return total;

        // Find minimum sum of subarray with length n - k
        int windowSize = n - k;
        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Slide the window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
    }
}
