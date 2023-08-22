import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("INFORME O VALOR DE X");
        double x = sc.nextDouble();
        System.out.println("INFORME O VALOR DE Y");
        double y = sc.nextDouble();
        
        sc.close();

        String quadrante = 
            (x == 0 && y == 0)? "ORIGEM":
            (x == 0)? "EIXO X":
            (y == 0)? "EIXO Y":
            (x > 0 && y > 0)? "Q1":
            (x < 0 && y > 0)? "Q2":
            (x < 0 && y < 0)? "Q3": "Q4";

        System.out.println(quadrante);
    }
}
