class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);

        }
        
        for( int i=0;i<nums.length;i++)
        {
            int a =nums[i];
            int p=target-a;
            if(map.get(p)!=null&&map.get(p)!=i)
            {
                ans[0]=i;
                   ans[1]=map.get(p);
            
            }
            else
            {
                continue;
         
            }

        }
        int[] ans1= new int[2];
        if(ans[0]>ans[1])
        { 
            ans1[0]=ans[1];
            ans1[1]=ans[0];
            
        }
        else
        {
           ans1[0]=ans[0];
           ans1[1]=ans[1];
        }
        
       
        return ans1;
    }
}
