class Solution {
    public String[] findRelativeRanks(int[] score) {
       int l=score.length;
       String[] ans=new String[l];
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
       for(int i=0;i<l;i++)
       {
        pq.offer(new int[]{score[i],i});
       }
       int rank=1;
       int a=0;
       while(!pq.isEmpty())
       {
        int[] p=pq.poll();
        int index=p[1];
        if(rank==1)
        {
            ans[index]="Gold Medal";
        }

     else   if(rank==2)
        {
            ans[index]="Silver Medal";
        }

      else  if(rank==3)
        {
            ans[index]="Bronze Medal";
        }
        else
        {
            ans[index]=String.valueOf(rank);
        }
        rank++;
       }

return ans;
    }
}