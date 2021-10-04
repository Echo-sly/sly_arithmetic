package leetCode;

/**
 * Demo demo0121maxprofit
 *
 * @author sunlianyu
 * @date 10月04日 16:16
 */
public class demo0121maxprofit {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int res=0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit= prices[i] - minprice;
            }
            res+=maxprofit;
        }
        return res;
    }
}
