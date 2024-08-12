class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // If the mid element is greater than the next element, 
                // then the peak must be in the left half or could be mid itself
                right = mid;
            } else {
                // If the mid element is less than the next element,
                // then the peak must be in the right half
                left = mid + 1;
            }
        }
        // At the end of the loop, left == right, which should point to the peak element
        return left;
    }
};
