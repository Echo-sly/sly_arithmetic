package leetCode;

/**
 * Demo demo0042rainWater
 *
 * @author sunlianyu
 * @time 9月23日 19:27
 */
public class demo0042rainWater {

    public static int rainWaterLeftRight(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWaterLeftRight(input));

    }

}
