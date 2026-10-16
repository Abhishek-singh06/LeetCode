class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] prefix=new int[nums.length+1];
        int[] prefixa=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            prefix[i+1]=Math.max(prefix[i],nums[i]);
        }
        prefixa[nums.length]=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--)
        {
            prefixa[i]=Math.min(prefixa[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(prefix[i+1]-prefixa[i]<=k)
            return i;
        }
        return -1;
    }
}