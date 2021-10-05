package leetCode;

/**
 * Demo demo1014maxScoreSightseeingPair
 *
 * @author sunlianyu
 * @date 10月04日 16:06
 */
public class demo1014maxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int ans = 0;
        int max = values[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, max + values[i] - i);
            max = Math.max(max, values[i] + i);
        }
        return ans;
    }
}
