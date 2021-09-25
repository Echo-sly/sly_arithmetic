package leetCode;

import java.util.Scanner;

/**
 * Demo demo0063uniquePathsWithStone
 *
 * @author sunlianyu
 * @date 9月25日 23:55
 */
public class demo0063uniquePathsWithStone {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int m = obstacleGrid.length;
        int[][] dp = new int[m][n];
        int lengthStoneFlag = 1;
        int widthStoneFlag = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][0] == 1) widthStoneFlag = 0;
                if (obstacleGrid[0][j] == 1) lengthStoneFlag = 0;
                if (obstacleGrid[i][j] == 1){
                    dp[i][j]=0;
                    continue;
                }
                if (i == 0 || j == 0) {
                    dp[i][j] = i == 0 ? lengthStoneFlag : widthStoneFlag;
                } else {
                    if (obstacleGrid[i][j - 1] == 1) {
                        dp[i][j] = dp[i - 1][j];
                    }else if (obstacleGrid[i - 1][j] == 1) {
                        dp[i][j] = dp[i][j - 1];
                    }else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
            int[][] arr={{0,0,1,0,0,1,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,0,1,0,0},{1,0,0,0,0,0,0,0},{0,0,0,1,0,1,0,0}};
            System.out.println(uniquePathsWithObstacles(arr));

    }
}
