class Solution {
    public int countRotations(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int l=sb.length();
        int c=0;
        int ans=0;
        while(c<l)
        {
            int check=0;
            c++;
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            for(int i=0;i<l-1;i++)
            {
                if(sb.charAt(i)==sb.charAt(i+1))
                check++;
            }
            if(check==k)
            ans++;
        }
        return ans;
    }
}