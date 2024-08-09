

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;  // If the target is found, return its index
            } else if (nums[mid] < target) {
                left = mid + 1;  // If target is greater, ignore the left half
            } else {
                right = mid - 1;  // If target is smaller, ignore the right half
            }
        }
        
        return left;  // If target is not found, return the insert position
    }
};
