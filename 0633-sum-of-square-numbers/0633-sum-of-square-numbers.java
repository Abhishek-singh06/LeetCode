class Solution {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            long b = c - i * i;
            long d = (long) Math.sqrt(b);

            if (d * d == b)
                return true;
        }
        return false;
    }
}