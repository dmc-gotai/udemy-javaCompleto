import java.util.Locale;
import java.util.Scanner;

public class Exercicio_21 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("QUANTOS TESTES SERAO FEITOS?");
        int numeroDeTestes = sc.nextInt();

        do {
            System.out.println("INFORME TRES NUMEROS REAIS COM NO MAXIMO UMA CASA DECIMAL: ");
            
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            System.out.printf("MEDIA PONDERADA = %.1f%n", ((a * 2) + (b * 3) + (c * 5)) / 10);
            numeroDeTestes--;
        } while (numeroDeTestes > 0);
        
        sc.close();
    }
}
