package hexlet.code.games;

import java.util.StringJoiner;

public class ProgressionGame implements Games {
    @Override
    public final String getInitialQuestion() {
        return "What number is missing in the progression?";
    }

    @Override
    public final String[] getQuestionAnswer() {
        int minAmountOfElementsInSequence = 5;
        int maxAmountOfElementsInSequence = 10;
        int maxNumberForStartSequence = 20;
        int maxDifferenceInSequence = 20;

        int countNumberInRow = Utils.getRandomInteger(minAmountOfElementsInSequence, maxAmountOfElementsInSequence);
        int hiddenPosition = Utils.getRandomInteger(countNumberInRow);
        int startNumber = Utils.getRandomInteger(maxNumberForStartSequence);
        int commonDifference = Utils.getRandomInteger(maxDifferenceInSequence);

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
