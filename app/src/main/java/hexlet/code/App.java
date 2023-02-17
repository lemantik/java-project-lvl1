package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit\nYour choice:");
        String answer = scanner.next();
        switch (answer) {
            case "1" :  Cli.greeting(scanner);
                        break;
            case "2" :  Game.evenGame(scanner);
                        break;
            case "0" :  System.out.println("Exit");
                        break;
        }
        scanner.close();
    }
}
