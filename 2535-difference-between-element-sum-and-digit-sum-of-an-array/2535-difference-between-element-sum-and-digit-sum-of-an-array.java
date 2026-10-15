class Solution {
    public int differenceOfSum(int[] nums) {
        int suma=0;
        int sumb=0;
        for(int i=0;i<nums.length;i++)
        {
            suma+=nums[i];
            sumb+=bit(nums[i]);
        }
        int ans=Math.abs(suma-sumb);
        return ans;
    }
    int bit(int a){
        int sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}