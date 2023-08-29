import java.util.Scanner;

public class Exercicio_19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("INFORME UM NUMERO INTEIRO POSITIVO MAIOR QUE 1 E MENOR QUE 1000: ");
        
        int inteiro = sc.nextInt();
        while (inteiro < 1 || inteiro > 1000 ){ //CONFIRMA QUE INPUT ESTEJA DENTRO DO INTERVALO
            System.out.println("NUMERO FORA DO INTERVALO\nINFORME UM NUMERO DENTRO DO INTERVALO 1...1000");
            inteiro = sc.nextInt();
        }
        sc.close();

        for(int i = 1; i <= inteiro; i++) {
            if(i % 2 != 0){
                System.out.printf("%d ", i);
            } else if (i % 15 == 0){ //IMPRIME NOVA LINHA A CADA 15 NUMEROS IMPARES
                System.out.println();
            }
        }
    }
}
