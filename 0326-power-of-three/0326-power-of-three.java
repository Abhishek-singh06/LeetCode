class Solution {
    public boolean isPowerOfThree(int n) {
      boolean ans=  check(n);
      return ans;
    }
    boolean check(int n)
    {
        if(n==1)
        return true;

        if(n<1 || n%3!=0)
        return false;
      return  check(n/3);
        

    }
}