package leetCode;

/**
 * Demo demo0053MaxSum
 *
 * @author sunlianyu
 * @date 9月24日 16:00
 */
public class demo0053MaxSum {


    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (n > 0) {
                n += nums[i];
            } else {
                n = nums[i];
            }
            if (sum < n) {
                sum = n;
            }
        }
        return sum;
    }


    public int maxSubArray1(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;++i){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;++i){
            res=dp[i]>res?dp[i]:res;
        }
        return res;
    }
}
