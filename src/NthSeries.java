/**
 * Created by white on 2015/8/23.
 */
public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1f / (i * 3 + 1);
        }
        return String.format("%.2f", sum);
    }
}