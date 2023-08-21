import java.util.Locale;
import java.util.Scanner;

/**
 * InnerExercicio_07
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        double PI = 3.14159;

        System.out.println("INSIRA TRES VALORES POSITIVOS MAIORES QUE ZERO\nCADA VALOR DEVER SER SEPARADO PELA TECLA ENTER");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double areaTrianguloRetangulo = (a * c) / 2;
        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);

        double areaCirculo = (PI * Math.pow(c, 2));
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);

        double areaTrapezio = ((a + b) * c) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);

        double areaQuadrado = Math.pow(b, 2);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

        double areaRetangulo = a * b;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}