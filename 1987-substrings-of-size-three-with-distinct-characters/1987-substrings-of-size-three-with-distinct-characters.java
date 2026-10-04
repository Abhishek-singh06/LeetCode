class Solution {
    public int countGoodSubstrings(String s) {
        int start=0;
        int ans=0;
        for(int i=0;i<s.length()-2;i++)
        {
            boolean check=true;
            HashMap<Character,Integer> map=new HashMap<>();
            String temp=s.substring(i,i+3);
            for(int j=0;j<3;j++)
            {
                map.put(temp.charAt(j),map.getOrDefault(temp.charAt(j),0)+1);
                if(map.get(temp.charAt(j))>1)
                {
                    check=false;
                break;
                }
               
            }
            if(check)
            ans++;
            

        }
        return ans;
    }
}