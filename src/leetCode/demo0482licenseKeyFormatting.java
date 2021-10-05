package leetCode;

/**
 * Demo demo0482licenseKeyFormatting
 *
 * @author sunlianyu
 * @date 10月04日 18:25
 */
public class demo0482licenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length();
        s = s.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        int temp = 0;
        for (int i = len - 1; i >= 0; i++) {
            if (temp % k == 0) {
                stringBuilder.insert(i - 1, "-");
            }
        }
        return stringBuilder.toString();
    }
}
