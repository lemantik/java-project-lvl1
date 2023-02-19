package hexlet.code.games;

public class CalcGame implements Games {
    @Override
    public String getInitialQuestion() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] getQuestionAnswer() {
        int firstElement = Utils.getRandomInteger();
        int secondElement = Utils.getRandomInteger();
        int operandIndex = Utils.getRandomInteger(0, 2);
        char[] operands = {'+', '-', '*'};

        char operand = operands[operandIndex];
        String question = firstElement + " " + operand + " " + secondElement;
        int answer = 0;

        switch (operand) {
            case '+' :  answer = firstElement + secondElement;
                        break;
            case '-' :  answer = firstElement - secondElement;
                        break;
            case '*' :  answer = firstElement * secondElement;
                        break;
            default :   break;
        }

        return new String[]{question, Integer.toString(answer)};
    }
}
