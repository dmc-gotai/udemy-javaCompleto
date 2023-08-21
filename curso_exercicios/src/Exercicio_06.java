/**
 * Exercicio_06
 */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printf("CODIGO DO ITEM: ");
        int primeiroItemCodigo = sc.nextInt();
        System.out.printf("NUMERO DE ITENS: ");
        int quantidadePrimeiroItem = sc.nextInt();
        System.out.printf("VALOR POR ITEM: ");
        double valorUnitarioPrimeiroItem = sc.nextDouble();

        System.out.printf("CODIGO DO ITEM: ");
        int segundoItemCodigo = sc.nextInt();
        System.out.printf("NUMERO DE ITENS: ");
        int quantidadeSegundoItem = sc.nextInt();
        System.out.printf("VALOR POR ITEM: ");
        double valorUnitarioSegundoItem = sc.nextDouble();
        
        sc.close();

        double valorTotal = (quantidadePrimeiroItem * valorUnitarioPrimeiroItem) + (quantidadeSegundoItem * valorUnitarioSegundoItem);
        
        System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
    }
}