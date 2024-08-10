class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> result(2, -1);
        if (nums.empty()) return result;

        int left = 0, right = nums.size() - 1;

        // Find the first occurrence of the target
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] != target) {
            return result;
        } else {
            result[0] = left;
        }

        // Find the last occurrence of the target
        right = nums.size() - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2; // Bias the mid to the right
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        
        result[1] = right;
        return result;
    }
};
