package hexlet.code.games;

public class Utils {
    public static int getRandomInteger(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
