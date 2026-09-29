class Solution {
    public String maximumOddBinaryNumber(String s) {
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='1')
            c++;
        }
        String first="";
        String last="";
        for(int i=0;i<c-1;i++)
        {
            first+="1";
        }
        int p=l-c;
        for(int i=0;i<p;i++)
        {
            first+="0";
        }
        first+="1";
        return first;
    }
}