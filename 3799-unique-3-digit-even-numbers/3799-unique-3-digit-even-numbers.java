class Solution {
    HashSet<Integer> set=new HashSet<>();

    public int totalNumbers(int[] digits) {
        boolean[] check=new boolean[digits.length];
        solve(digits,check,0,0 );
        return set.size(); 
    }
 
    void solve(int[] arr,boolean[] check,int position,int number) {
        if(position==3) {
            set.add(number);
            return;
        }

        for(int i=0;i<arr.length;i++) {

            if(position==0 && arr[i]==0)
                continue;

            if(check[i])
                continue;

            if(position==2 && arr[i]%2!=0)
                continue;

            check[i]=true;
         int   nnumber=number*10+arr[i];
            solve(arr,check,position+1,nnumber);

            check[i]=false;
        }
    }
}