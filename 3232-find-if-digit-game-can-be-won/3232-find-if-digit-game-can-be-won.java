class Solution {
    public boolean canAliceWin(int[] nums) {
        int l=nums.length;
        int alice=0,rest=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>9)
            {
                alice+=nums[i];
            }
            else
            {
                rest+=nums[i];
            }
        }
        if(alice==rest)
        return false;
        return true;
    }
}