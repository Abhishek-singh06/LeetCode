class Solution {
    public int sumBase(int n, int k) {
        int ans=0,num=0;
        while(n!=0)
        {
            int temp=n%k;
            num=(num*10)+temp;
            ans+=temp;
            n/=k;
        }
        return ans;
    }
}