class Solution {
    HashSet<Integer> set=new HashSet<>();
    public int[] findEvenNumbers(int[] digits) {
        boolean check[]=new boolean[digits.length];
        solve(digits,check,0,0);
        int l=set.size();
        int[] ans=new int[l];
        int i=0;
        for(int x:set)
        {
            ans[i++]=x;

        }
         Arrays.sort(ans);
        return ans;
    }
    void solve(int[] arr,boolean[] check,int position,int number)
    {
        if(position==3)
        {
        set.add(number);
        return;
        }
        
      for(int i=0;i<arr.length;i++)
      {
        if(check[i])
        continue;

        if(position==0 && arr[i]==0)
        continue;

        if(position==2 && arr[i]%2!=0)
        continue;
        check[i]=true;
       int nnumber = number * 10 + arr[i];
        solve(arr,check,position+1,nnumber);
        check[i]=false;
      }

    }
}