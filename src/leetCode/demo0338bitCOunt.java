package leetCode;

import java.util.Scanner;

/**
 * Demo demo0338bitCOunt
 *
 * @author sunlianyu
 * @date 9月24日 21:38
 */
public class demo0338bitCOunt {
    public static int countBits(int n) {
        int temo = 1;
        int temp = n;
        while (n / 2 != 0) {
            n /= 2;
            temo++;
        }
        int[] arr = new int[temo];
        int count = 0;
        for (int i = 0; i < temo; i++) {

            count += temp % 2 == 1 ? 1 : 0;
            temp >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            int ans = countBits(n);
            System.out.println(ans);
        }
    }
}

