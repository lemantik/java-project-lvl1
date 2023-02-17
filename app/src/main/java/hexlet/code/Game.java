package hexlet.code;

import java.util.Scanner;

public class Game {
    public static void evenGame(Scanner scanner) {
        String userName = Cli.greeting(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        byte round = 1;
        boolean isAnswerRight = false;
        do {
            int number = getRandomInteger();

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            isAnswerRight = rightAnswer.equalsIgnoreCase(answer);
            if (isAnswerRight) {
                System.out.println("Correct!");
                round += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        } while (isAnswerRight & round <= 3);
        System.out.println("Congratulations, " + userName + "!");
    }

    private static int getRandomInteger() {
        return (int)(Math.random() * 100);
    }
}
