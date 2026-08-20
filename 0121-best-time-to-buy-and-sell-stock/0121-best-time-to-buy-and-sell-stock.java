class Solution {
    public int maxProfit(int[] prices) {
        int min = 999999;
        int ans = 0;
        if (prices.length <= 1) {
            return 0;
        }
        int p = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                p = i;

                int max = 0;

                for (int j = p; j < prices.length; j++) {
                    if (max < prices[j]) {
                        max = prices[j];
                    }
                }

                int pa = max - min;
                if(pa>ans)
                ans=pa;

            }
        }
        return ans;

    }
}