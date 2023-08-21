import java.util.Scanner;
public class Exercicio_09 {
    
    public static void main(String[] args) {
        
        System.out.println("INFORME UM NUMERO INTEIRO: ");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
