import java.util.Locale;
import java.util.Scanner;

public class Exercicio_25 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO DE LINHAS: ");
        int linhas = sc.nextInt();
        sc.close();

        for(int i = 1; i <= linhas; i++) {
            System.out.printf("LINHA %d AO QUADRADO %d AO CUBO %d%n", i, (i * i), (i * i * i));
        }
    }
}
