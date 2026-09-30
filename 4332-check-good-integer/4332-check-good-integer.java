class Solution {
    public boolean checkGoodInteger(int n) {
        int temp=n;
        int sum=0,sq=0;
        while(temp>0)
        {
            
            int c=temp%10;
            sum+=c;
            sq+=c*c;
            temp/=10;
        }
        if(sq-sum>=50)
        return true;
        return false;
    }
}