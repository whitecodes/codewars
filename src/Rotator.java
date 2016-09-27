/**
 * Created by white on 2015/8/30.
 */
public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Object[] retArrays = new Object[data.length];
        for (int i = 0; i < data.length; i++) retArrays[i] = data[(data.length + i - n % data.length) % data.length];
        return retArrays;
    }

}

//Best Solutions 感觉重复造轮子了
//import java.util.Arrays;
//        import java.util.Collections;
//
//public class Rotator {
//
//    public Object[] rotate(Object[] data, int n) {
//        Collections.rotate(Arrays.asList(data), n);
//        return data;
//    }
//}
