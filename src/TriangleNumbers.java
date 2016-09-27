/**
 * Created by white on 2015/10/18.
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        Boolean is = false;
        for (int i = 0; i < number / 2; i++) {
            if (number == (1 + i) * i / 2) {
                is = true;
                break;
            }
        }
        return is;
    }

//    public static Boolean isTriangleNumber(long number) {
//        return Math.sqrt(1+8*number)%1==0;
//    }
}

