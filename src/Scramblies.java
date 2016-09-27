import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by white on 9/27/2016.
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        String[] str2List = str2.split("");
        String[] strTempList = str1.split("");
        ArrayList<String> str1List = new ArrayList<>();
        Collections.addAll(str1List, strTempList);
        for (String str : str2List
                ) {
            if (str1List.indexOf(str) == -1) {
                return false;
            } else {
                str1List.remove(str);
            }
        }


//        for (String string2 : str2List) {
//            if (str1.indexOf(string2) == -1) {
//                return false;
//            } else {
//                str1 = str1.replaceFirst(string2, "0");
//            }
//        }
        return true;
    }
}
