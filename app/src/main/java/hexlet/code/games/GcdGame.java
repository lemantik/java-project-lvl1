package hexlet.code.games;

public class GcdGame implements Games {

    @Override
    public String getInitialQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] getQuestionAnswer() {
        int number1 = Utils.getRandomInteger(1, 100);
        int number2 = Utils.getRandomInteger(1, 100);
        int answer = getGCD(number1, number2);

        return new String[]{number1 + " " + number2, Integer.toString(answer)};
    }

    private static int getGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        } else {
            return getGCD(num2 % num1, num1);
        }
    }
}
