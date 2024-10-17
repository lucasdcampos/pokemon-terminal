import java.util.Random;

public class Utils {
    static Random random = new Random();

    public static int randomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
