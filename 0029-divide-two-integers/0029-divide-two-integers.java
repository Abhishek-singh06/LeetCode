class Solution {
    public int divide(int dividend, int divisor) {
        long a=Math.abs((long)dividend);
        long b=Math.abs((long) divisor);
        long quotient=0;
        while(a>=b)
        {
            long d=b;
            long count=1;
            while(a>(d<<1))
            {
                d=d<<1;
                count=count<<1;
            }
            a-=d;
            quotient+=count;
        }
        boolean c=divisor<0;
        boolean q=dividend<0;
        boolean negative=c!=q;
        if(negative==true)
        {
            quotient=-quotient;
        }
           if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;

           
        }
         return (int)quotient;
}
}