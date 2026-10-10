class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int l=nums.length;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                for(int k=j+1;k<l;k++)
                {
                    if(nums[j]-nums[i]== diff && nums[k]-nums[j]==diff)
                    ans++;
                }
            }
        }
        return ans;
    }
}