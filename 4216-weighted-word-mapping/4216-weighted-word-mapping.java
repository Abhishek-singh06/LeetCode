class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> map=new HashMap<>();
        String ans="";
        char ch='a';
        for(int i=0;i<26;i++)
        {
            map.put(ch++,weights[i]);
        }
        int l=words.length;
        for(int i=0;i<l;i++)
        {
            int sum=0;
            for(int j=0;j<words[i].length();j++)
            {
                sum+=map.get(words[i].charAt(j));
            }
          char cha = (char)('z' - (sum % 26));
            ans+=cha;
        }
        return ans;
    }
}