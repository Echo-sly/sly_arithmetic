package leetCode;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

/**
 * Demo demo0918maxSubarraySumCircular
 *
 * @author sunlianyu
 * @date 10月03日 14:55
 */
public class demo0918maxSubarraySumCircular {
    public static int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int res = Integer.MIN_VALUE;
        int res1 = Integer.MAX_VALUE;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (i == 0) {
                dp[0] = nums[0];
            } else {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            }
            res = Math.max(res, dp[i]);
        }
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[0] = nums[0];
            } else {
                dp[i] = Math.min(dp[i - 1] + nums[i], nums[i]);
            }
            res1 = Math.min(res1, dp[i]);
        }
        return Math.max(res, sum - res1);
    }

    public static void main(String[] args) {
        maxSubarraySumCircular(new int[] {-2,-3,-1});
    }
}

