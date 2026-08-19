class Solution {
    public boolean check(int[] nums) {
        int[] check = nums.clone();
        Arrays.sort(check);
        int x = -1;

        for (int i = 0; i < nums.length; i++) {
            boolean ans = true;
            for (int j = 0; j < nums.length; j++) {
                if (check[j] != nums[(i + j) % nums.length]) {
                    ans = false;
                    break;
                }
            }
             if (ans)
            return true;
        }
       
        return false;

    }
}