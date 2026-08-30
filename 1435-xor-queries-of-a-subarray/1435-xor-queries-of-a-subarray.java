class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] com= new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            com[i+1]=com[i]^arr[i];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
         {
            int l=queries[i][0];
            int r=queries[i][1];
            ans[i]=com[l]^com[r+1];
         }
         return ans;
    }
}