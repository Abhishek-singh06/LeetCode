class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> big=new ArrayList<>();
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        for(int num:nums)
        {
            if(num<pivot)
            {
                small.add(num);
            }
            else if(num>pivot)
            {
                big.add(num);
            }
            else
            {
                equal.add(num);
            }
        
        }
        int i=0;
        for(int num:small)
        {
            nums[i++]=num;
        }
        for(int num:equal)
        {
            nums[i++]=num;
        }
        for(int num:big)
        {
            nums[i++]=num;
        }
        return nums;
    }
}