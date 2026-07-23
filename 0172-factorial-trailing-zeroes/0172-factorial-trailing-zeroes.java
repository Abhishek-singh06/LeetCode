class Solution {
    public int trailingZeroes(int n) {
        int sum=0;
    while(n>0)
    {
        int p=n/5;
        sum+=p;
        n/=5;
    }
    return sum;
    }
}