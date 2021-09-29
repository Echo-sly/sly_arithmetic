package leetCode;

/**
 * Demo demo0198rob
 *
 * @author sunlianyu
 * @date 9月29日 08:43
 */
public class demo0198rob {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(nums[i],dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {

    }
}
