import java.util.Date;

/**
 * Created by white on 9/27/2016.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int ss=seconds%60;
        seconds=seconds/60;
        int mm=seconds%60;
        int hh=seconds/60;
        return String.format("%02d:%02d:%02d",hh,mm,ss);
    }
}
