/**
 * Exercicio_05
 */
import java.util.Locale;
import java.util.Scanner;
public class Exercicio_05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Insira o numero do funcionário, seu número de horas trabalhadas e o valor que recebe por hora.\nCada dado deve ser separado através da tecla ENTER.");
        
        Scanner sc = new Scanner(System.in);
        int funcionarioNumero = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        sc.close();

        System.out.printf("FUNCIONARIO: %d%nSALARIO: U$ %.2f%n", funcionarioNumero, ((double)horasTrabalhadas * valorPorHora));
    }
}