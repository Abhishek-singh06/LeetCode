class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num:nums)
        {
            if(num<0)
            neg.add(num);
        }
        for(int num:nums)
        {
            if(num>=0)
            pos.add(num);
        }
        int i=0,p=0;
        for(int j=0;j<nums.length;j++)
        {
            if(j%2==0)
            nums[j]=pos.get(i++);
            else
            nums[j]=neg.get(p++);
        }
        return nums;
    }
}