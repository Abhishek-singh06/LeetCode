class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int l=mat.length;
        int l1=mat[0].length;
        int[] sum=new int [l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l1;j++)
            {
                if(mat[i][j]==1)
                sum[i]++;
            }
        }
     PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->
     {
        
        if(a[0]!=b[0])
         return Integer.compare(a[0],b[0]);
         return Integer.compare(a[1],b[1]);
     } );
     for(int i=0;i<sum.length;i++)
     {
        pq.add(new int[]{sum[i],i});
     }   
     int[] ans=new int[k];
     for(int i=0;i<k;i++)
     {
        int[] p=pq.poll();
        ans[i]=p[1];
     }
     return ans;

    }

}