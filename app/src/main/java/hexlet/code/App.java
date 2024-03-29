package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n");
        System.out.print("Your choice: ");
        String answer = scanner.next();
        switch (answer) {
            case "1" :  Cli.greeting(scanner);
                        break;
            case "2" :  Engine.runGame(new EvenGame(), scanner);
                        break;
            case "3" :  Engine.runGame(new CalcGame(), scanner);
                        break;
            case "4" :  Engine.runGame(new GcdGame(), scanner);
                        break;
            case "5" :  Engine.runGame(new ProgressionGame(), scanner);
                        break;
            case "6" :  Engine.runGame(new PrimeGame(), scanner);
                        break;
            default :   System.out.println("Exit");
        }
        scanner.close();
    }
}
