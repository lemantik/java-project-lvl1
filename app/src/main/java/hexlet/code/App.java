package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\n");
        System.out.print("Your choice:");
        String answer = scanner.next();
        switch (answer) {
            case "1" :  Cli.greeting(scanner);
                        break;
            case "2" :  Engine.runGame(new EvenGame(), scanner);
                        break;
            case "3" :  Engine.runGame(new CalcGame(), scanner);
                        break;
            case "0" :  System.out.println("Exit");
                        break;
        }
        scanner.close();
    }
}
