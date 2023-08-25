import java.util.Scanner;

public class Para {
    
    public static void main(String[] args) {
        
        System.out.printf("FATORIAL DE ");
        Scanner sc = new Scanner(System.in);
        int contador = sc.nextInt();
        sc.close();

        int fatorial = 1;

        for(int i = 1; i <= contador; i++) {
            fatorial *= i;
        }

        System.out.printf("FATORIAL DE %d = %d%n", contador, fatorial);
    }
}
