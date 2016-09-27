import java.util.Arrays;
import java.util.Collections;

/**
 * Created by white on 2015/10/18.
 */
public class HighAndLow {
    public static String HighAndLow(String numbers) {
        String[] numStringList = numbers.split(" ");
        Integer[] numList = new Integer[numStringList.length];
        for (int i = 0; i < numStringList.length; i++) {
            numList[i] = Integer.parseInt(numStringList[i]);
        }
        int minNum = Collections.min(Arrays.asList(numList));
        int maxNum = Collections.max(Arrays.asList(numList));
        return Integer.toString(maxNum) + " " + Integer.toString(minNum);
    }

//    public static String HighAndLow(String numbers) {
//        int min = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
//        int max = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).max().getAsInt();
//        return String.format("%d %d", max, min);
//    }
}
