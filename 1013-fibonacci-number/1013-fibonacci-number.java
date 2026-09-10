class Solution {
    public int chance(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
         
         return chance(n-1)+chance(n-2);
    }
    public int fib(int n) {
        int sum=0;
        sum+=chance(n);
        return sum;
    }
}