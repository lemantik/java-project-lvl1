package hexlet.code;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Brain Games!" );
        String userName = new Cli().askUserName();
        System.out.format("Hello, %s!\n", userName);
    }
}
