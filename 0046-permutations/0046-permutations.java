class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> pat=new ArrayList<>();
        List<Integer> mat=new ArrayList<>();
        backtrack(0,pat,mat,nums);
        return pat;
    }
    void backtrack(int index,List<List<Integer>> pat,List<Integer> mat,int[] nums)
    {
        if(mat.size()==nums.length)
        {
        pat.add(new ArrayList<>(mat));
        return;
        }
        for(int i=0;i<nums.length;i++)
        {
          if(mat.contains(nums[i]))
          continue;
          mat.add(nums[i]);
          backtrack(index+1,pat,mat,nums);
          mat.remove(mat.size()-1);
        }
    }
}