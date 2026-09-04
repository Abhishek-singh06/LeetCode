class Solution {
    String convert(int n)
        {
            String ans="";
            while(n>0)
            {
                ans=n%2+ans;
                n/=2;
            }
            return ans;
        }

    public int minBitFlips(int start, int goal) {
        String l=convert(start);
        String p=convert(goal);
        int n=(l.length()>p.length())?l.length():p.length();
        int n1=n;
        int n2=n;
   while(p.length() < n)
{
    p = "0" + p;
}

while(l.length() < n)
{
    l = "0" + l;
}
        int i=0;
        int ans=0;
        while(i<l.length())
        {
            if(p.charAt(i)!=l.charAt(i))
            ans++;
            i++;
            
        }    
            return ans;
        }
}