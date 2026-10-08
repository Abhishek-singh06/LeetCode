class Solution {
    public int totalMoney(int n) {
        int c=1;
        int mon=2;
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(i%7==1 && i!=1)
            {
               
                
                  c=mon;
                mon++;
              
                
            }
           
                ans+=c;
                c++;
           
        }
        return ans;
    }
}