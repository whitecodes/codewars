/**
 * Created by white on 2015/11/13.
 */
public class DRoot {
    public static int digital_root(int n) {
        String s = String.valueOf(n);
        for (; s.length() > 1; ) {
            String[] sList = s.split("");
            s = new String("0");
            for (String str : sList) {
                s = strAdd(s, str);
            }
        }
        return Integer.valueOf(s);
    }

    private static String strAdd(String a, String b) {
        int n = Integer.valueOf(a);
        int m = Integer.valueOf(b);
        return String.valueOf(n + m);
    }
}

//public class DRoot {
//    public static int digital_root(int n) {
//        return n < 10 ? n : digital_root(digital_root(n/10)+n%10);
//    }
//}