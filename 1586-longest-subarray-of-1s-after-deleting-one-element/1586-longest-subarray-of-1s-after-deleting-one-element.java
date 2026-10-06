class Solution {
    public int longestSubarray(int[] nums) {
        int start=0;
        int l=nums.length;
        int c=0;
        int max=0;
        int count=0;
        for(int i=0;i<l;i++)
        {
            //count=0;
            if(nums[i]==1)
            {
                count++;
            }
            if(nums[i] == 0)
{
    c++;
}
                while(c>1)
                {
                    if(nums[start]==0)
                    {
                        c--;
                    }
                    start++;
                }
           max=Math.max(max,i-start);
        }
        return max;
    }
}