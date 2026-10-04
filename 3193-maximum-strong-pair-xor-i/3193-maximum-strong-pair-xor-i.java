class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int l=nums.length;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            int x=nums[i];
          for(int j=i;j<l;j++)
          {
            int y=nums[j];
            if(Math.abs(x-y)<=Math.min(x,y))
            {
                if((x^y )>ans)
                {
                    ans=x^y;
                }
            }
          }
          
        }
        return ans;
    }
}