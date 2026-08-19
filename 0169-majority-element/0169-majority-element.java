class Solution {
    public int majorityElement(int[] nums) 
    {
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j=0;j<nums.length;j++)
        {
            if(map.get(nums[j])>nums.length/2)
               ans=nums[j];
        }
        return ans;
    }
}