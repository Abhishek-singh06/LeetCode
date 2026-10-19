class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff=new int[grid.length][grid[0].length];
            int[] oneRow=new int[grid.length];
            int[] oneCol=new int[grid[0].length];
            int[] zeroRow=new int[grid.length];
            int[] zeroCol=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            
            for(int j=0;j<grid[0].length;j++)
            {
              if(grid[i][j]==1)
              {
                oneCol[j]++;
                oneRow[i]++;
              }
              else
              {
                zeroCol[j]++;
                zeroRow[i]++;
              }
            }
        }
           for(int i=0;i<grid.length;i++)
        {
            
            for(int j=0;j<grid[0].length;j++)
            {
              
              diff[i][j]=oneRow[i]+oneCol[j]-zeroRow[i]-zeroCol[j];
            }
        }
        return diff;
    }
}