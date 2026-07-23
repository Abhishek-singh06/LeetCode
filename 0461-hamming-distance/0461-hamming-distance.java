class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int ans = 0;

        while (xor != 0) {
            int l=xor%2;
            if(l==1)
            {
                ans++;
            }
            xor/=2;
        }

        return ans;
    }
}