class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l=grid.length;
        int l1=grid[0].length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=l*l;i++)
        {
          map.put(i,1);
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l1;j++)
            {
               map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
     for(Map.Entry<Integer,Integer> entry: map.entrySet())
     {
        if(entry.getValue()==3)
        {
            ans[0]=entry.getKey();
        }
        if(entry.getValue()==1)
        {
            ans[1]=entry.getKey();
        }
     }
     return ans;
    }
}