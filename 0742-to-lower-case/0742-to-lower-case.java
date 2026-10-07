class Solution {
    public String toLowerCase(String s) {
        int l=s.length();
        String ans="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            ans+=s.charAt(i);
            else
            {
                ans+=Character.toLowerCase(ch);
            }
        }
        return ans;
    }
}