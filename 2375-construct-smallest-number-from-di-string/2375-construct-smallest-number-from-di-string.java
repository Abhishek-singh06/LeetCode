class Solution {
    String ans="";
    public String smallestNumber(String pattern) {
        boolean[] digit=new boolean[10];
        backtrack(0,pattern,new StringBuilder(),digit);
        return ans;
    }
    boolean backtrack(int index,String pattern,StringBuilder num,boolean[] digit)
    {
        if(index==pattern.length()+1)
        {
          ans=num.toString();
          return true;
        }

        for(int n=1;n<=9;n++)
        {
            if(digit[n]==true)
            continue;

            if(index>0)
            {
               char prev=num.charAt(index-1);
               char curr=(char)('0'+ n) ;
               if(pattern.charAt(index-1)=='I' && prev>=curr)
               continue;
               if(pattern.charAt(index-1)=='D' && prev<=curr)
               continue;
            }
            digit[n]=true;
            num.append(n);
            if(backtrack(index+1,pattern,num,digit))
            return true;

            num.deleteCharAt(num.length()-1);
            digit[n] = false;

        }
        return false;

    }
}