//Exercício - Soma de dois inteiros

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num1 = sc.nextInt();
        sc.nextLine();
        int Num2 = sc.nextInt();
        sc.close();

        System.out.printf("SOMA = %d", (Num1 + Num2));
    }
}
