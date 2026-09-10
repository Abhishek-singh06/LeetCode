class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        int ans = 0;
      
        while (!isSorted(l)) {
              int min=Integer.MAX_VALUE;
        int index=-1;
            int size=l.size();
            for(int i=0;i<size-1;i++)
            {
                if(l.get(i)+l.get(i+1)<min)
                {
                    min=l.get(i)+l.get(i+1);
                    index=i;
                    
                }
            }
            l.remove(index+1);
            l.remove(index);
            l.add(index,min);
            ans++;

        }
        if(ans==0)
        return 0;

        return ans;
    }

    public boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1))
                return false;
        }
        return true;
    }

}