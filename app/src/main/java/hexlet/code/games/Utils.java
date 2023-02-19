package hexlet.code.games;

public class Utils {
    public static int getRandomInteger(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int getRandomInteger(int max) {
        return (int) (Math.random() * (max - 1)) + 1;
    }

    public static int getRandomInteger() {
        int defaultMaxNumber = 100;

        return (int) (Math.random() * (defaultMaxNumber - 1)) + 1;
    }
}
