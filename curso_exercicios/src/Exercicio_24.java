import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM VALOR INTEIRO");
        int numero = sc.nextInt();
        sc.close();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.printf("%d É DIVISOR DE %d%n", i, numero);
            }
        }
    }
}
