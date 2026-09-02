class Solution {
    public String reverseWords(String s) {
        
        s+=" ";
        int l=s.length();
        String word="";
        String ans="";
        String part="";
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            word+=s.charAt(i);
            else
            {
                part+=word;
                if(word!="")
                part+=' ';
                word="";
            }
            
        }
        s=part.substring(0,part.length());
        l=s.length();
        int j=l;
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                ans+=s.substring(i+1,j);
                ans+=' ';
                j=i;
            }
            if(i==0)
            {
                ans+=s.substring(0,j);
            }
        }
        return ans.substring(1,ans.length());
    }
}