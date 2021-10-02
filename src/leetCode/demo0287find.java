package leetCode;

/**
 * Demo demo0287find
 *
 * @author sunlianyu
 * @date 9月24日 15:14
 */
public class demo0287find {
    public static int find(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

