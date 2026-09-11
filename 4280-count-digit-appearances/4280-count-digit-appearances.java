class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int answer=0;
        for(int i=0;i<nums.length;i++)
        {
            answer+=check(nums[i],digit);
        }
        return answer;
    }
    int check(int n,int c)
    {
        int ans=0;
        while(n!=0)
        {
            if(n%10==c)
            ans++;
            n/=10;
        }
        return ans;
    }
}