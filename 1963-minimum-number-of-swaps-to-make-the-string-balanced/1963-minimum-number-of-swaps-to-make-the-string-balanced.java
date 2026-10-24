class Solution {
    public int minSwaps(String s) {
        int left=0;
        int right=s.length()-1;
        int max=0;
        int balance=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
             balance++;
            else
            balance--;

            max=Math.max(-balance,max);
        }
        int ans=(max+1)/2;
        return ans;
    }
}