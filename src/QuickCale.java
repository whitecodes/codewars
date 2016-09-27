/**
 * Quick (n choose k) calculator
 * <p>
 * Created by white on 2015/8/30.
 */

import java.math.BigInteger;

class QuickCalc {

    public static BigInteger recursion(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger num = new BigInteger(String.valueOf(i));
            result = result.multiply(num);
        }
        return result;
    }

    public static BigInteger choose(int n, int p) {
        return recursion(n).divide(recursion(p).multiply(recursion(n - p)));
    }
}
