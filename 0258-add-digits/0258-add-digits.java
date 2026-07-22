class Solution {
    public int addDigits(int num) {
        int ans=0;
        while(num/10!=0)
        {
             int suma=0;
             int numa=num;
            while(numa!=0)
            {
               suma+=numa%10;
               numa/=10;
            }
            num=suma;
            ans++;
        }
        return num;
    }
}