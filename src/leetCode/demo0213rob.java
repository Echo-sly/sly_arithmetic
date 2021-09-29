package leetCode;

/**
 * Demo demo0213rob
 *
 * @author sunlianyu
 * @date 9月29日 09:11
 */
public class demo0213rob {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n-1; i++) {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        int[] dp2 = new int[nums.length];
        dp2[1]=nums[1];
        dp2[2]=Math.max(nums[1], nums[2]);
        for (int i = 3; i < n; i++) {
            dp2[i]=Math.max(nums[i]+dp2[i-2],dp2[i-1]);
        }
        return Math.max(dp[n-2],dp2[n-1]);
    }
}
