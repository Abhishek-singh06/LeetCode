class Solution {
    public int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            c++;
            else
            break;
        }
        c++;
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            
            num[i]=nums[(i+c)%nums.length];
        }
       while(low<=high)
       {
            int mid=low+(high-low)/2;
            if(num[mid]==target)
            {
             return (mid+c)%nums.length;
            }
           else if(target>num[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;

    }
}