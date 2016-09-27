/**
 * Created by white on 9/27/2016.
 */

import java.math.BigInteger;

public class Oddity {

    public static String oddity(BigInteger n) {
        double m = Math.sqrt(n.doubleValue());
        if (m % 1 == 0) {
            return "odd";
        } else {
            return "even";
        }
    }
}