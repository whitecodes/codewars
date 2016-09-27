import java.util.Random;

/**
 * Created by white on 2015/8/23.
 */
public class Ghost {

    public String getColor() {
        int i = new Random().nextInt(4);
        switch (i) {
            case 0:
                return "white";
            case 1:
                return "yellow";
            case 2:
                return "purple";
            default:
                return "red";
        }
    }
}
