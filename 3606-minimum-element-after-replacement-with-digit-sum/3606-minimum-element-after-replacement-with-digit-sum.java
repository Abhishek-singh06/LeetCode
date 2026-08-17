class Solution {
    public int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int ans=99999;
        for(int i=0;i<nums.length;i++)
        {
            int p=sum(nums[i]);
            if(p<ans)
            ans=p;
        }
        return ans;
    }
}