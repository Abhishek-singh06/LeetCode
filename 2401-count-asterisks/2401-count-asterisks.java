class Solution {
    public int countAsterisks(String s) {
        int l=s.length();
        int c=0;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='|' )
            {
                c++;

            }
            if(c%2==0)
            {
                if(ch=='*')
                ans++;
            }
        }
        return ans;
    }
}