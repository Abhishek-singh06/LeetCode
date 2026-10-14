class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int sq=i*i;
            boolean c=backtrack(String.valueOf(sq),i,0,0);
            if(c)
            sum+=sq;
        }
        return sum;
    }
    boolean backtrack(String sq,int p,int index,int sum)
    {
        if(index==sq.length())
        {
            return sum==p;
        }
        int value=0;
        for(int i=index;i<sq.length();i++)
        {
            value=value*10+(sq.charAt(i)-'0');
            if(backtrack(sq,p,i+1,sum+value))
            return true;

        }
        return false;
    }
}