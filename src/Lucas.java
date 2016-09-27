/**
 * Created by white on 2015/8/22.
 */
public class Lucas {
    public static int lucasnum(int n) {
        if (n == 0) {
            return (2);
        } else if (n == 1) {
            return (1);
        } else if (n < 0) {
            return (lucasnum(n + 2) - lucasnum(n + 1));
        } else {
            return (lucasnum(n - 1) + lucasnum(n - 2));
        }
    }
}
//public class Lucas {
//    public static int lucasnum (int n){
//        return n == 0 ? 2 : n == 1 ? 1 : n < 0 ? lucasnum(n+2) - lucasnum(n+1) : lucasnum(n-1) + lucasnum(n - 2);
//    }
//}