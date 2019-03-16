class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        if (n > 1) {
            int in = prices[0], out = prices[0];
            for (int i = 1; i < n; i++) {
                if (prices[i] <= in)
                    in = prices[i];
                else {
                    out = prices[i];
                    int cur = out - in;
                    max = cur > max ? cur : max;
                }
            }
        }
        return max;
    }
}