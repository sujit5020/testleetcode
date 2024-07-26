class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max1=0;
        int cnt=0;
        int n=nums.size();
        int i;
        for(i=0;i<n;i++)
        {
            if(nums[i]==1){
                cnt++;
                max1=max(max1,cnt);
            }
            else{
                cnt=0;
            }
        }
        return max1;
    }
};