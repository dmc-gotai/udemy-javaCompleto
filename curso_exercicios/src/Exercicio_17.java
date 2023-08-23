import java.util.Scanner;

/**
 * Exercicio_17 - LEITOR DE COORDENADAS
 */
public class Exercicio_17 {

    public static void main(String[] args) {
        
        System.out.println("INSIRA O VALOR DE DUAS COORDENADAS SEPARADAS PELA TECLA ENTER.\nINSIRA 0 EM QUALQUER UM DOS VALORES PARA SAIR");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0) System.out.println("PRIMEIRO QUADRANTE");
            else if (x < 0 && y > 0) System.out.println("SEGUNDO QUADRANTE");
            else if (x < 0 && y < 0) System.out.println("TERCEIRO QUADRANTE");
            else if (x > 0 && y < 0) System.out.println("QUARTO QUADRANTE");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
