class Solution {
    public long pickGifts(int[] gifts, int k) {
       PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<gifts.length;i++)
       {
        pq.add((long)gifts[i]);
       } 
       for(int i=0;i<k;i++)
       {
        long a=pq.poll();
      double ab=Math.floor(Math.sqrt(a));
        pq.add((long)ab);
       }
       long ans=0;
      while(!pq.isEmpty())
      {
        ans+=pq.poll();
      }
       return ans;
    }
}