class Solution {
    public int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<nums.length;i+=2)
    {
        for(int j=1;j<=nums[i];j++)
        {
            a.add(nums[i+1]);
        }
    }
    int[] ans=new int[a.size()];

    for(int i=0;i<a.size();i++)
    {
        ans[i]=a.get(i);
    }
    return ans;
    }
}