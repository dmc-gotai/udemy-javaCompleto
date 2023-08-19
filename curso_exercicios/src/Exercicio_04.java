//Retorna a diferença do produto das
//variáveis A e B pelo produto das 
//variáveis C e D.

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int D = sc.nextInt();
        sc.nextLine();
        sc.close();

        System.out.printf("DIFERENCA = %d", ((A * B) - (C * D)));
    }   
}
