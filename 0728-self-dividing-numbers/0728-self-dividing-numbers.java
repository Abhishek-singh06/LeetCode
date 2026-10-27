class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))
            ans.add(i);
        }
        return ans;
        
    }
    boolean check(int n)
    {
        int c=n;
        while(n!=0)
        {
            int temp=n%10;
            if(temp==0)
            return false;
            if(c%temp!=0)
            return false;
            n/=10;
        }
        return true;
    }
}