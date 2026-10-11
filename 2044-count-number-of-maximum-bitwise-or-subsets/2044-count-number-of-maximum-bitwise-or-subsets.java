class Solution {
    int count=0;
    int target=0;
    public int countMaxOrSubsets(int[] nums) {
        
        for(int num:nums)
        {
            target|=num;
        }
        backtrack(0,nums,0);
        return count;

    }
    void backtrack(int index,int[] nums,int curror)
    {
        if(index==nums.length)
        {
            if(curror==target)
            {
                count++;
            }
            return;
        }
        backtrack(index+1,nums,curror|nums[index]);
        backtrack(index+1,nums,curror);
    }
}