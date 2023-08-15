import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println(" What is your name?");
        try (Scanner scan = new Scanner(System.in)) {
            String YOUR_NAME = scan.nextLine();
            System.out.printf("Greetings, %s!\n", YOUR_NAME);
        }
    }
}
