class Solution {
    public void setZeroes(int[][] matrix) {
        int l = matrix.length;
        int l1 = matrix[0].length;
        List<Integer> p = new ArrayList<>();
        List<Integer> k = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l1; j++) {
                if (matrix[i][j] == 0) 
                {
                    p.add(i);
                    k.add(j);
                   

                }
            }
        }
        for(int i=0;i<p.size();i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[p.get(i)][j]=0;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<k.size();j++)
            {
                matrix[i][k.get(j)]=0;
            }
        }
        

    }
}