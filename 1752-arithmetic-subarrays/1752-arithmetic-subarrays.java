class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int la=l.length;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<la;i++)
        {
            int[] arr=new int[r[i]-l[i]+1];
            int p=0;
            for(int j=l[i];j<=r[i];j++)
            {
                arr[p]=nums[j];
                p++;
            }
            Arrays.sort(arr);
            boolean ansa=true;
           
            int check=Math.abs(arr[0]-arr[1]);
            for(int k=0;k<arr.length-1;k++)
            {
                if((Math.abs(arr[k]-arr[k+1])==check))
                continue;
                else
                ansa=false;
                
            }
            ans.add(ansa);
        }
        return ans;
    }
}