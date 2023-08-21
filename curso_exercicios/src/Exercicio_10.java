import java.util.Scanner;

/**
 * Exercicio_10
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        
        System.out.println("PROGRAMA - ANALISE DE MULTIPLOS\n");
        System.out.println("INFORME DOIS VALORES INTEIROS");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a % b == 0 || b % a == 0) {
            System.out.println("MULTIPLOS");
        } else {
            System.out.println("NAO MULTIPLOS");
        }
    }
}