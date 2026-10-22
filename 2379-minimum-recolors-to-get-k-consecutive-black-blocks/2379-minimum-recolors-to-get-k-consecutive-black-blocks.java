class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                ans++;
            }
        }
        int count=ans;
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i-k)=='W')
            {
                count--;
            }
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
            ans=Math.min(ans,count);
        }
        
        return ans;
    }
}