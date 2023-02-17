package hexlet.code;

import hexlet.code.games.Games;

import java.util.Scanner;

public class Engine {
    public static void runGame(Games game, Scanner scanner) {
        boolean isAnswerRight = false;
        int round = 0;

        String userName = Cli.greeting(scanner);
        System.out.println(game.getInitialQuestion());
        do {
            String [] questionAnswer= game.getQuestionAnswer();
            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            isAnswerRight = questionAnswer[1].equalsIgnoreCase(answer);
            if (isAnswerRight) {
                System.out.println("Correct!");
                round += 1;
            } else {
                sayYouLose(userName, answer, questionAnswer[1]);
                return;
            }
        } while (isAnswerRight & round <= ROUNDS);
        System.out.println("Congratulations, " + userName + "!");
    }
    public static byte ROUNDS = 3;
    public static void sayYouLose(String userName, String usersAnswer, String rightAnswer) {
        System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
}
