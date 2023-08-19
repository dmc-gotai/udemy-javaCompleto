//Encontra a área de uma circunferencia
//com entrada do raio
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));;
        double PI = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextInt();
        sc.close();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
    }    
}
