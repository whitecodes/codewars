/**
 * 吸血鬼数是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各自包含乘积的一半位数的数字，
 * 其中从最初的数字中选取的数字可以任意排揎。
 * 以两个0结尾的数字是不允许的。
 * 例如，以下的数字都是“吸血鬼”数字
 * 1260=21*60
 * 1827=21*87
 * 2187=27*81
 * <p>
 * Created by white on 10/14/2016.
 */
public class VampireNumber {

    public static void getVampireNumber() {

        int num;
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++)
                if (i % 10 != 0 || j % 10 != 0) {
                    num = i * j;
                    if (isVampire(String.valueOf(i), String.valueOf(j), String.valueOf(num))) {
                        System.out.println(num + "=" + i + "*" + j);
                    }
                }
        }
    }

    private static boolean isVampire(String i, String j, String num) {
        if (i.length() + j.length() != num.length()) {
            return false;
        } else {
            char[] numList = num.toCharArray();
            String ijList = i.concat(j);
            for (char str : numList
                    ) {
                if (strCount(str, ijList) != strCount(str, num)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int strCount(char charStr, String strList) {

        int count = 0;

        for (int i = 0; i < strList.length(); i++) {
            if (charStr == strList.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
