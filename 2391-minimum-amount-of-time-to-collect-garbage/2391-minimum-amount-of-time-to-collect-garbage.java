class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum=0,lastP=0,lastM=0,lastG=0;
        for(int i=0;i<garbage.length;i++)
        {
            sum+=garbage[i].length();
            if(garbage[i].indexOf("G")!=-1)
            {
                lastG=i;
            }
            if(garbage[i].indexOf("P")!=-1)
            {
                lastP=i;
            }
            if(garbage[i].indexOf("M")!=-1)
            {
                lastM=i;
            }
        }
        int[] prefix=new int[travel.length+1];
        for(int i=0;i<travel.length;i++)
        {
            prefix[i+1]=prefix[i]+travel[i];
        }
        sum+=prefix[lastM]+prefix[lastG]+prefix[lastP];
         return sum;
    }
}