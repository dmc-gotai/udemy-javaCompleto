import java.util.Scanner;
public class Exercicio_12 {
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAMA - VALOR DO PEDIDO");
        System.out.printf("MENU%n%d %-20s%5s%n", 1, "CACHORRO QUENTE", "R$4.00");
        System.out.printf("%d %-20s%5s%n",2, "X-SALADA", "R$4.50");
        System.out.printf("%d %-20s%5s%n",3, "X-BACON", "R$5.00");
        System.out.printf("%d %-20s%5s%n", 4, "TORRADA SIMPLES", "R$2.00" );
        System.out.printf("%d %-20s%5s%n", 5, "REFRIGERANTE", "R$1.50" );

        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O ITEM DESEJADO");
        int pedido = sc.nextInt();

        System.out.println("INFORME A QUANTIDADE: ");
        int quantidade = sc.nextInt();
        sc.close();

        double valorDoPedido = quantidade;
        switch (pedido) {
            case 1:
                valorDoPedido *= 4.0;
                break;
            case 2:
                valorDoPedido *= 4.5;
                break;
            case 3:
                valorDoPedido *= 5.0;
                break;
            case 4:
                valorDoPedido *= 2.0;
                break;
            case 5:
                valorDoPedido *= 1.5;
                break;
            default:
                System.out.println("PEDIDO OU QUANTIDADE NAO RECONHECIDOS PELO SISTEMA.");
        }

        System.out.printf("TOTAL:%18s%.2f%n","R$", valorDoPedido);

    }
}
