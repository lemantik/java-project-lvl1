package hexlet.code;

import hexlet.code.games.Utils;

import java.util.Scanner;

public class Game {
    public static void evenGame(Scanner scanner) {
        String userName = Cli.greeting(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        byte round = 1;
        boolean isAnswerRight = false;
        do {
            int number = Utils.getRandomInteger(1, 100);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            isAnswerRight = rightAnswer.equalsIgnoreCase(answer);
            if (isAnswerRight) {
                System.out.println("Correct!");
                round += 1;
            } else {
                Engine.sayYouLose(userName, answer, rightAnswer);
                return;
            }
        } while (isAnswerRight & round <= Engine.ROUNDS);
        System.out.println("Congratulations, " + userName + "!");
    }
}
