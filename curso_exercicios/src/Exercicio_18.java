import java.util.Scanner;

/**
 * Exercicio_18 - AVALIADOR DE COMPRA DE COMBUSTIVEL
 */
public class Exercicio_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("QUAL FOI O TIPO DE COMBUSTIVEL ABASTECIDO?");
        System.out.printf("%d %s%n%d %s%n%d %s%n%d %s%n", 1, "Alcool", 2, "Diesel", 3, "Gasolina", 4, "SAIR");
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;

        int input = 0;

        while (input != 4){
            input = sc.nextInt();
            switch(input) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    diesel++;
                    break;
                case 3:
                    gasolina++;
                    break;
                case 4:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("CODIGO DESCONHECIDO");
                    break;
            }
        }

        System.out.printf("RESULTADO PARCIAL%n%s %d%n%s %d%n%s %d%n", "ALCOOL: ", alcool, "DIESEL: ", diesel, "GASOLINA", gasolina);
    }
}