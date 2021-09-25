package alho;

import java.util.Scanner;

/**
 * Demo Main
 *
 * @author sunlianyu
 * @date 9月25日 09:02
 */
public class Main {

    /**
     * 求一个自然数的位数
     *
     * @param num
     * @return
     */
    public static int bitNum(int num) {
        int bitNum = 1;
        while (num / 10 != 0) {
            bitNum++;
            num /= 10;
        }
        return bitNum;
    }

    /**
     * 求一个自然数是不是质数
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    /**
     * 求一个自然数是不是对称数
     *
     * @param num
     * @return
     */
    public static boolean isCycle(int num) {
        String y = String.valueOf(num);
        StringBuilder sb = new StringBuilder(y);
        String y1 = sb.reverse().toString();
        return y1.equals(y);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.print(bitNum(num) + " ");
            System.out.print(isCycle(num) ? "Yes " : "No ");
            System.out.println(isPrime(num) ? "Yes" : "No");
        }
    }
}

