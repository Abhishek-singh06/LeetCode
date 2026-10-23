class Solution {
    public long gcdSum(int[] nums) {
       int[] prefixGcd=new int[nums.length];
       long ans=0;
       int[]  mx=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            mx[i+1]=Math.max(mx[i],nums[i]);
            prefixGcd[i]=gcd(mx[i+1],nums[i]);
        }
         Arrays.sort(prefixGcd);
         int left=0;
         int right=nums.length-1;
         while(left<right)
         {
            ans+=gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
         }
          return ans;
    }
     int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }
   
}