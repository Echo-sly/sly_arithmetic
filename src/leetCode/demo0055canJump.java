package leetCode;

/**
 * Demo demo0055canJump
 *
 * @author sunlianyu
 * @date 9月29日 23:11
 */
public class demo0055canJump {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        boolean[] dp = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (dp[i]) {
                for (int j = 1; j <= nums[i] && i + j < n; j++) {
                    dp[i + j] = true;
                }
            }
        }
        return dp[n - 1];
    }
}
