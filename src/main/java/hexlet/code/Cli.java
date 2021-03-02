package hexlet.code;

import java.util.Scanner;

public class Cli
{
    public static String askUserName() {
        System.out.println( "May I have your name?" );
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        return userName;
    }
}
