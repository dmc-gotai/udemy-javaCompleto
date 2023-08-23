import java.util.Scanner;

/**
 * Exercicio_16 - VALIDADOR DE SENHA
 */
public class Exercicio_16 {

    public static void main(String[] args) {
        
        int SENHAVALIDA = 2002;
        int senha = 0;
        Scanner sc = new Scanner(System.in);

        while(senha != SENHAVALIDA) {
            System.out.print("Senha: ");
            senha = sc.nextInt();
            if (senha == SENHAVALIDA) {
                System.out.println("ACESSO PERMITIDO");
            } else {
                System.out.println("SENHA INVALIDA");
            }      
        }
        sc.close();        
    }
}