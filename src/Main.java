//import myPart01_Tree.BinaryTreeFunction;
import java.util.Scanner;

/**
 * Demo Main
 *
 * @author sunlianyu
 * @date 10月09日 13:57
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fib = new int[22];
        fib[1] = 1;
        fib[2] = 1;
        for (int j = 3; j < fib.length; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
        }
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i == 0) {
                System.out.println("1 1");
                return;
            }
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            int res = 0;
            for (int j = 2; j < 21; j++) {
                if (left == Math.min(Math.abs(fib[j]-i),left)){
                    res = j-1;
                    break;
                }
                left = Math.min(Math.abs(fib[j]-i),left);
            }
            System.out.printf("%d %d\n",res,fib[res]);

        }
    }
}
