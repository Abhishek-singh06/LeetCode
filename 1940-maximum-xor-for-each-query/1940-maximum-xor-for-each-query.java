class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] answer=new int[nums.length];
        int p=0;
        int sumx=0;
        for(int i=0;i<nums.length;i++)
        {
            sumx^=nums[i];
        }
        int mask=(1<<maximumBit)-1;
        for(int i=nums.length-p-1;i>=0;i--)
        {
            
            answer[p]=sumx^mask;
            sumx^=nums[i];
            p++;
            

        }
        return answer;
    }
}