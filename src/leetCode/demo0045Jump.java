package leetCode;

import java.util.Arrays;

/**
 * Demo demo0045Jump
 *
 * @author sunlianyu
 * @date 9月29日 23:33
 */
public class demo0045Jump {
    public static int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 0xFFFF);
        dp[0] = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j <= nums[i] && i + j < n; ++j) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        jump(new int[]{3, 2, 1});
    }
}
