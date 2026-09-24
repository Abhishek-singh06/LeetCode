class Solution {
    public int pivotInteger(int n) {
        int i=1;
      int c=0;
        while(i<=n)
        {
            int suma=0;
            int sumb=0;
            for(int j=1;j<=i;j++)
            {
                suma+=j;
            }
            for(int j=i;j<=n;j++)
            {
                sumb+=j;
            }
            if(suma==sumb)
            {
                return i;
            }
            i++;
        }
       return -1;

        
    }
}