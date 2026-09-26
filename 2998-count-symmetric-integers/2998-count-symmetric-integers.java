class Solution {
    boolean check(int num)
    {
       String s=String.valueOf(num);
       int l=s.length();
       if (l % 2 != 0)
       return false;
       int suma=0;
       int sumb=0;
       for(int i=0;i<l;i++)
       {
        if(i<l/2)
        suma+=s.charAt(i)-'0';
        else
         sumb+=s.charAt(i)-'0';
       }
        return(suma==sumb);
       
    }

    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            boolean p = check(i);
            if (p)
                ans++;
        }
        return ans;
    }
}