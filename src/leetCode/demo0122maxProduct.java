package leetCode;

/**
 * Demo demo0122maxProduct
 *
 * @author sunlianyu
 * @date 10月04日 16:47
 */
public class demo0122maxProduct {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
