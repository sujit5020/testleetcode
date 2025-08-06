class Solution {
    int total = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return total;
    }

    private void dfs(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            total += currentXor;
            return;
        }

        // Include current number
        dfs(nums, index + 1, currentXor ^ nums[index]);

        // Exclude current number
        dfs(nums, index + 1, currentXor);
    }
}
