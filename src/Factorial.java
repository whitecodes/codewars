import java.math.BigInteger;

/**
 * 阶乘
 * <p>
 * Created by white on 10/14/2016.
 */
public class Factorial {

    public static String Factorial(int n) {

        BigInteger num;

        if (n <= 1) {
            return "1";
        } else {
            num = new BigInteger(String.valueOf(n));
            return getFactorial(num).toString();
        }
    }

    private static BigInteger getFactorial(BigInteger n) {

        if (BigInteger.ONE.compareTo(n) < 0) {
            return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
        } else {
            return BigInteger.ONE;
        }

    }
}
