class Solution {
    public int subarraySum(int[] nums) {
        int psum=0;
        for(int i=0;i<nums.length;i++)
        {
         int n=Math.max(0,i-nums[i]);
         int sum=0;
         for(int j=n;j<=i;j++)
         {
              sum+=nums[j];
         }
         psum+=sum;
        }
        return psum;
    }
}