/**
 * Created by white on 2015/9/27.
 */

public class Sequence {

    public static long getScore(long n) {

        if (n <= 0) {
            return 0;
        } else {
            return getScore(n - 1) + 50 * n;
        }
    }
}