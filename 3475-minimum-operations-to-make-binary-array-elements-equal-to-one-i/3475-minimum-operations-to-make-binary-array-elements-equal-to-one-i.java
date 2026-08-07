class Solution {
    public int minOperations(int[] nums) {
        int l=nums.length;
       int c=0;
       int sum=0;
            for(int p=0;p<nums.length-2;p++)
            {
                if(nums[p]==1){
                    
                continue;
                }
                else
                {
                nums[p]^=1;
                nums[p+1]^=1;
                nums[p+2]^=1;
                c++;
                
                }
            }
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        sum++;
       }
       if(sum==l)
       return c;


       return -1;
    }
}