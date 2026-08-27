class Solution {
    public int findTheWinner(int n, int k) {
        return circle(n,k)+1;
    }
    public int circle(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (circle(n-1,k)+k)%n;
        
}
}