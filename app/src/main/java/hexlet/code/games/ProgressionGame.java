package hexlet.code.games;

import java.util.StringJoiner;

public class ProgressionGame implements Games {
    @Override
    public String getInitialQuestion() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getQuestionAnswer() {
        int countNumberInRow = Utils.getRandomInteger(5, 10);
        int hiddenPosition = Utils.getRandomInteger(1, countNumberInRow);
        int startNumber = Utils.getRandomInteger(1, 20);
        int commonDifference = Utils.getRandomInteger(1, 20);

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
