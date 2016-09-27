/**
 * Created by white on 2015/9/12.
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i : args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}


//import java.util.stream.IntStream;
//
//public class SmallestIntegerFinder {
//    public static int findSmallestInt(int[] args) {
//        return IntStream.of(args).min().getAsInt();
//    }
//}