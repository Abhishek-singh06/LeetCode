class Solution {
    public String frequencySort(String s) {
        int l=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            int freq=Integer.compare(map.get(b),map.get(a));
            if(freq!=0)
            return freq;
            return Character.compare(b,a);
        });
        pq.addAll(map.keySet());
        

        
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty())
        {
            char ch=pq.poll();
            for(int i=map.get(ch);i>0;i--)
            ans.append(ch);
        }
        return ans.toString();
    }
}