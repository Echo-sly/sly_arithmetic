package leetCode;

/**
 * Demo demo0152maxProduct
 *
 * @author sunlianyu
 * @date 10月04日 15:41
 */
public class demo0152maxProduct {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dpMax = new int[n];
        int[] dpMin = new int[n];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            dpMax[i] = Math.max(dpMax[i - 1] * nums[i], Math.max(dpMin[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMax[i - 1] * nums[i], Math.min(dpMin[i - 1] * nums[i], nums[i]));
            ans = Math.max(ans, dpMax[i]);
        }
        return ans;
    }
}
