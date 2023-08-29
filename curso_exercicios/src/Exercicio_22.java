import java.util.Locale;
import java.util.Scanner;

public class Exercicio_22 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        System.out.printf("QUANTOS PARES DE DIVISAO? ");
        int numeroDeOperacoes = sc.nextInt();

        while (numeroDeOperacoes > 0) {

            System.out.println("INSIRA DOIS VALORES INTEIROS");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b != 0){
                double resultado = (double) a / (double) b;
                System.out.printf("RESULTADO = %.2f%n", resultado);
            } else {
                System.out.printf("IMPOSSIVEL DIVIDIR %d POR %d%n", a, b);
            }          
            
            numeroDeOperacoes--;
        }

        sc.close();
    }
}
