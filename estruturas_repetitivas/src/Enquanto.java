import java.util.Scanner;
//Soma valores até input = 0
public class Enquanto {

    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);        
        System.out.println("INFORME UM NUMERO A SER SOMADO. DIGITE 0 PARA SAIR.");
        
        int input = sc.nextInt();

        while(input != 0) {
            soma += input;
            input = sc.nextInt();
        }
        sc.close();

        System.out.printf("Soma: %d", soma);
    }
}
