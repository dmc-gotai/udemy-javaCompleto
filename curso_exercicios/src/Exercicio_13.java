import java.util.Scanner;
/**
 * Exercicio_13
 */
public class Exercicio_13 {
    
    public static void main(String[] args) {
        
        System.out.println("INFORME UM NUMERO INTEIRO: ");
        Scanner sc = new Scanner(System.in);
        int numeroAvaliado = sc.nextInt();
        sc.close();

        String intervalo = 
            (numeroAvaliado < 0 || numeroAvaliado > 100)? "FORA DO INTERVALO":
            (numeroAvaliado >= 0 && numeroAvaliado <= 25)? "INTERVALO [0, 25]": 
            (numeroAvaliado <= 50) ? "INTERVALO (25, 50]":
            (numeroAvaliado <= 75) ? "INTERVALO (50, 75]":"INTERVALO (75, 100]";

        System.out.println(intervalo);
    }
}