import java.util.*;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // Base case: sum 0 appears once

        int sum = 0, result = 0;
        for (int num : nums) {
            sum += num;
            // If there exists prefix with sum = sum - goal
            if (prefixCount.containsKey(sum - goal)) {
                result += prefixCount.get(sum - goal);
            }
            // Update frequency of current prefix sum
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
