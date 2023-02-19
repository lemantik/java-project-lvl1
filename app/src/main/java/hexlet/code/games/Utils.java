package hexlet.code.games;

public class Utils {
    public static int getRandomInteger(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int getRandomInteger(int max) {
        return (int) (Math.random() * (max - 1)) + 1;
    }

    public static int getRandomInteger() {
        return (int) (Math.random() * (100 - 1)) + 1;
    }
}
