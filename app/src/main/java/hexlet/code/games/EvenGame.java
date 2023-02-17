package hexlet.code.games;

public class EvenGame implements Games{
    @Override
    public String getInitialQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] getQuestionAnswer() {
        int question = Utils.getRandomInteger(1, 100);
        String rightAnswer = question % 2 == 0 ? "yes" : "no";
        return new String[]{Integer.toString(question), rightAnswer};
    }
}
