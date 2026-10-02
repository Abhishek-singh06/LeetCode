class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> map=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(map.get(i-1).get(j-1)+map.get(i-1).get(j));
            }
            if(i>0)
            row.add(1);
            map.add(row);
        }        
        return map;
    }
}