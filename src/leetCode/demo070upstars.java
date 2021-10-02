package leetCode;

/**
 * Demo demo070upstars
 *
 * @author sunlianyu
 * @date 9月24日 21:25
 */
public class demo070upstars {
    public int climbStairs(int n) {

        int[] dp = new int[n + 3];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
