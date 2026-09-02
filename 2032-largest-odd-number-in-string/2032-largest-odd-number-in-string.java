class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();
        String ans="";
        for(int i=l-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0)
        {        ans=num.substring(0,i+1);
            return ans;
        }
        }
        
        return "";
    }
}