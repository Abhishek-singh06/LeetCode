class Solution {
    int sq(int num)
    {
        int sum=0;
        while(num!=0)
        {
           sum += (num % 10) * (num % 10);
            num/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       HashSet<Integer> map=new HashSet<>();
       while(true)
       {
        int l=map.size();
        int sum=sq(n);
        n=sum;
        if(sum==1)
        {
        return true;
        }
        
        else{
            map.add(sum);
            if(map.size()==l)
            break;
        }

       }
       return false;
    }
}