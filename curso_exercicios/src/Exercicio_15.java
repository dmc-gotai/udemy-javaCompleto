import java.util.Locale;
import java.util.Scanner;

//PROGRAMA - VALOR DO IMPOSTO DE RENDA
//Calcula o valor devido do IR com base na faixa salarial

public class Exercicio_15 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        System.out.println("INFORME O SALARIO");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        sc.close();

        double tributo = 0;
        double salarioTributavel = salario;

        if (salario > 2000) {
            if (salario < 3000) {
                salarioTributavel -= 2000;
                tributo = salarioTributavel * 0.08;
            }
            else {
                tributo = 80;
                salarioTributavel = salario - 3000;
                if (salario < 4500) {
                    tributo += salarioTributavel * 0.18;
                } 
                else {
                    tributo += 270;
                    salarioTributavel = salario - 4500;
                    tributo += salarioTributavel * 0.28;
                }
            }
            System.out.printf("R$ %.2f%n", tributo);
        }
        else {
            System.out.println("ISENTO DE IMPOSTO");
        }            

    }
}
