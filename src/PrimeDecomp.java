import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by white on 9/27/2016.
 */
public class PrimeDecomp {

    public static String factors(int n) {
        int nTemp = n;
        BigInteger primes = new BigInteger("2");
        ArrayList<String> pkList = new ArrayList<>();
        ArrayList<String> nkList = new ArrayList<>();
        int pk = primes.intValue();
        int nk = 0;
        do {
            if (nTemp % pk == 0) {
                pkList.add(String.valueOf(pk));
                while (nTemp % pk == 0) {
                    nk++;
                    nTemp = nTemp / pk;
                }
                nkList.add(String.valueOf(nk));
            }
            primes = primes.nextProbablePrime();
            pk = primes.intValue();
            nk = 0;
        } while (nTemp != 1);
        String retStr = "";
        for (int i = 0; i < pkList.size(); i++) {
            retStr = retStr + "(" + pkList.get(i);
            if (!nkList.get(i).equals("1")) {
                retStr = retStr + "**" + nkList.get(i);
            }
            retStr = retStr + ")";
        }
        return retStr;
    }
//    public static String factors(int lst) {
//        String result = "";
//        for (int fac = 2; fac <= lst; ++fac) {
//            int count;
//            for (count = 0; lst % fac == 0; ++count) {
//                lst /= fac;
//            }
//            if (count > 0) {
//                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
//            }
//        }
//        return result;
//    }
}
