class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            start=mid+1;
            else
            end=mid-1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
            return i;
        }
        return nums.length;
    }
}