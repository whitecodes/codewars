/**
 * Created by white on 2015/8/30.
 */

import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int s : integers) {
            if (Collections.frequency(result, s) < 1) result.add(s);
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}

//public class UniqueArray {
//    public static int[] unique(int[] integers) {
//        return Arrays.stream(integers).distinct().toArray();
//    }
//}
