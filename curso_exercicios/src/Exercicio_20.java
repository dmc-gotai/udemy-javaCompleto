import java.util.Scanner;
public class Exercicio_20 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;

        System.out.println("INFORME QUANTOS NUMEROS SERAO ANALISADOS");
        int totalDeInputs = sc.nextInt();

        for(int i = 0; i < totalDeInputs; i++){
            
            System.out.println("INFORME UM NUMERO:");
            int valor = sc.nextInt();
            
            if(valor >= 10 && valor <= 20) {
                dentroDoIntervalo++;
            } else {
                foraDoIntervalo++;
            }
        }
        sc.close();

        System.out.printf("%d NUMEROS DENTRO DO INTERVALO%n%d NUMEROS FORA DO INTERVALO", dentroDoIntervalo, foraDoIntervalo);
    }
}
