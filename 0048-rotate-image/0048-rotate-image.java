class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        int l1=matrix[0].length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l1;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<l1/2;j++)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][l1-1-j];
                    matrix[i][l1-1-j]=temp;

                }
            }
        }
    }
