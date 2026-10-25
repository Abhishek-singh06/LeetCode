class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] prefix=new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            prefix[i+1]=prefix[i]+arr[i];
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int len=j-i+1;
                if(len%2==1)
                ans+=prefix[j+1]-prefix[i];
            }
        }
        return ans;
    }
}