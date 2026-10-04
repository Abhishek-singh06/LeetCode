class Solution {
    public int maximumLengthSubstring(String s) {
        int start=0;
        int end=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2)
            {
               char remove=s.charAt(start);
               map.put(remove,map.get(remove)-1);
               start++;
            }
               

            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }
}