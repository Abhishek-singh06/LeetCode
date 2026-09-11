class Solution {
    public int totalWaviness(int num1, int num2) {
        int answer=0;
        for(int i=num1;i<=num2;i++)
        {
            answer+=wave(i);
        }
        return answer;
    }
    int wave(int n)
    {
        String s=String.valueOf(n);
        int l=s.length();
        int ans=0;
        for(int i=1;i<l-1;i++)
        {
           if(s.charAt(i)>s.charAt(i+1) &&s.charAt(i)>s.charAt(i-1) )
           ans++;
           else if(s.charAt(i)<s.charAt(i+1) &&s.charAt(i)<s.charAt(i-1)) 
           ans++;
        }
        return ans;
    }
}