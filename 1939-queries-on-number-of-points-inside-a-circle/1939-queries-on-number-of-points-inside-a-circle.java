class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int l1=points.length;
        int l2=points[0].length;
        int l3=queries.length;
        int l4=queries[0].length;
        int[] answer=new int[queries.length];
        int p=0;
        for(int i=0;i<l3;i++)
        {
            int ans=0;
            for(int j=0;j<l1;j++)
            {
                int dx=queries[i][0]-points[j][0];
                int dy=queries[i][1]-points[j][1];
                if(dx*dx+dy*dy<=queries[i][2]*queries[i][2])
                ans++;
            }
            answer[p]=ans;
            p++;
        }
        return answer;
     
    }
}