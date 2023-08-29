import java.util.Locale;
import java.util.Scanner;

public class Exercicio_23 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("INFORME UM NUMERO PARA CALCULO DE FATORIAL: ");
        int numero = sc.nextInt();
        sc.close();

        int fatorial = 1;

        if(numero == 0){
            System.out.println("FATORIAL DE 0 = 1");
        } 
        else {
            for(int i = 1; i <= numero; i++){
                fatorial *= i;
            }
            System.out.printf("FATORIAL DE %d = %d", numero, fatorial);
        }

        
    }
}
