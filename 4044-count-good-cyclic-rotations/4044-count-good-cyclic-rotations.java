class Solution {
    public int countGoodRotations(int[] nums) {
        int[] num = new int[nums.length * 2];
        int n = nums.length;
        int ans = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            num[i] = nums[i];
            num[i + n] = nums[i];
            sum += nums[i];
        }
        long check=0;
        for(int i=0;i<nums.length/2;i++)
        {
            check+=num[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            long check2=sum-check;
            if(check2<check)
            ans++;
            check-=num[i];
            check+=num[(i+n/2)%n];

        }

       
        return ans;
    }
}