class Solution {
    public List<Integer> partitionLabels(String s) {
        int l=s.length();
        List<Integer> a=new ArrayList<>();
        int index=0;
        int start=0;
        while(start<s.length())
        {
            char ch=s.charAt(start);
            int in=s.lastIndexOf(ch);
            index=in;
            for(int j=start;j<=index;j++)
            {
                char cha=s.charAt(j);
                int ina=s.lastIndexOf(cha);
            index=Math.max(index,ina);
            }
            a.add(index-start+1);
            start=index+1;
        }
        return a;
    }
}