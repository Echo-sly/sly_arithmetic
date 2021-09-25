package leetCode;

/**
 * Demo demo0746minCost
 *
 * @author sunlianyu
 * @date 9月25日 23:14
 */
public class demo0746minCost {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        for (int i = 0; i < cost.length; i++) {
            if (i == 1 || i == 0) dp[i] = cost[i];
            if (i >= 2)
                dp[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return dp[cost.length - 1];
    }
}
