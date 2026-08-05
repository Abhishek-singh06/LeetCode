class Solution {
    public boolean palindrome(int num)
    {int a=0;
           int n=num;
           while(num!=0)
           {
            a=10*num%10+a;
            num/=10;

           }
           if(a==n)
           return true;
           return false;
    }
    public int check (int num,int n)
    {
        int ans=0;
        while(num>0)
        {
            ans=10*(num%n)+ans;
            num/=n;
        }
     boolean ret=   palindrome(ans);
     if(ret==true)
     {
        return 1;
     }
     return -1;
    }
    
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++)
        {
           int ans= check(n,i);
           if(ans==-1)
           return false;
        }
        
        return true;
    }
}