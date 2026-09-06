class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int l = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();

            //for (int k = 0; k < l; k++) {
              //  map.put(A[k], 1);
            //}
        int[] ans = new int[l];
        for (int j = 0; j < l; j++) {
            int c = 0;
            map.put(A[j], 1);
            for (int i = 0; i<=j; i++) {
                if (map.containsKey(B[i]) && map.get(B[i])==1) {
                    c++;
                }
            }
            ans[j] = c;
        }
        return ans;
    }
}