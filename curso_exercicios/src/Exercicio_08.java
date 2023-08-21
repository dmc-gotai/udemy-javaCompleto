/**
 * Exercicio_08
 */
import java.util.Scanner;
public class Exercicio_08 {

    public static void main(String[] args) {
        
        System.out.println("DIGITE UM NUMERO INTEIRO");
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

    }
}