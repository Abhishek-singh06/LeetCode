class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int a=nums[0];
        int b=nums[nums.length-1];
        for(int i=1;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}