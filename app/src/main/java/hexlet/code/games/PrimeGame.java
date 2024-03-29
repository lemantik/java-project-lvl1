package hexlet.code.games;

public class PrimeGame implements Games {
    private static final int MAX_PRIME_NUMBER = 1000;
    @Override
    public final String getInitialQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public final String[] getQuestionAnswer() {
        int question = Utils.getRandomInteger(MAX_PRIME_NUMBER);

        String answer = isPrime(question) ? "yes" : "no";
        return new String[] {Integer.toString(question), answer};
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int halfNumber = number / 2;
        for (int i = 2; i < halfNumber; i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
