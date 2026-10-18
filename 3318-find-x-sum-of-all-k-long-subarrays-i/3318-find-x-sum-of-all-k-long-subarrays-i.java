class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
     int l=nums.length;
     int[] suma=new int[l-k+1];
      for(int i=0;i<=l-k;i++)
      {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=i;j<=i+k-1;j++)
        {
          map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int freq=Integer.compare(map.get(b),map.get(a));
            if(freq!=0)
            return freq;

            return Integer.compare(b,a);
        });
        pq.addAll(map.keySet());
        int sum=0;
        for(int o=0;o<Math.min(x,map.size());o++)
        {
            int n=pq.poll();
            sum+=n*map.get(n);
        }
        suma[i]=sum;
      }  
      return suma;
    }
}