class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
       
        int ans=0;
        int lsum=0;
        for(int i=0;i<nums.length-1;i++)
        {
             
             int rsum=sum;
            lsum+=nums[i];
            rsum-=lsum;
            if((rsum-lsum)%2==0)
            {
            ans++;
            }
        }
        return ans;
    }
}