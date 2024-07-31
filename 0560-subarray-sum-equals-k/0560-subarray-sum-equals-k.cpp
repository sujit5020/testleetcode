class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int cnt=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int sum1=0;
            for(int j=i;j<n;j++)
            {
                sum1+=nums[j];
                if(sum1==k)
                {
                    cnt++;
                }

            }
           
        }
        return cnt;
         
    }
};