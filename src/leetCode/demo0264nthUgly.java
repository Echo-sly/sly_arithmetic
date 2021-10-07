package leetCode;

/**
 * Demo demo0264nthUgly
 *
 * @author sunlianyu
 * @date 10月07日 22:34
 */
public class demo0264nthUgly {
    public int nthUglyNumber(int n) {
        int n2 = 0,n3 = 0,n5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1;i<n;i++){
            dp[i] = Math.min(2*dp[n2],Math.min(3*dp[n3],5*dp[n5]));
            if(dp[i] == 2*dp[n2]) n2++;
            if(dp[i] == 3*dp[n3]) n3++;
            if(dp[i] == 5*dp[n5]) n5++;
        }
        return dp[n-1];
    }
}
