import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demo test
 *
 * @author sunlianyu
 * @date 9月23日 20:34
 */
public class test {
    static volatile int sunlianyu=0;

    public static void main(String[] args) {

       sunlianyu=1;
        sunlianyu = 2;
    }
}
