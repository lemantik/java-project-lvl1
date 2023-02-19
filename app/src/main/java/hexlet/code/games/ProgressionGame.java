package hexlet.code.games;

import java.util.StringJoiner;

public class ProgressionGame implements Games {
    private static final int   MIN_AMOUNT_IF_ELEMENTS_IT_SEQUENCE = 5;
    public static final int MAX_AMOUNT_OF_ELEMENTS_IN_SEQUENCE = 10;
    public static final int MAX_NUMBER_FOR_START_SEQUENCE = 20;
    public static final int MAX_DIFFERENCE_IN_SEQUENCE = 20;
    @Override
    public final String getInitialQuestion() {
        return "What number is missing in the progression?";
    }

    @Override
    public final String[] getQuestionAnswer() {
        int countNumberInRow = Utils.getRandomInteger(MIN_AMOUNT_IF_ELEMENTS_IT_SEQUENCE,
                MAX_AMOUNT_OF_ELEMENTS_IN_SEQUENCE);
        int hiddenPosition = Utils.getRandomInteger(countNumberInRow);
        int startNumber = Utils.getRandomInteger(MAX_NUMBER_FOR_START_SEQUENCE);
        int commonDifference = Utils.getRandomInteger(MAX_DIFFERENCE_IN_SEQUENCE);

        var question = new StringJoiner(" ");
        int currNumber = startNumber;
        String answer = "";
        String currElement;

        for (int i = 1; i <= countNumberInRow; i += 1) {
            currNumber += commonDifference;
            currElement = Integer.toString(currNumber);

            if (i != hiddenPosition) {
                question.add(currElement);
            } else {
                question.add("..");
                answer = currElement;
            }
        }
        return new String[] {question.toString(), answer};
    }
}
