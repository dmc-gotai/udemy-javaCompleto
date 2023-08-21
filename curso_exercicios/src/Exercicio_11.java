import java.util.Scanner;

public class Exercicio_11 {
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAMA - DURACAO DE JOGO");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INFORME O HORARIO DE COMECO: ");
        int horarioComeco = sc.nextInt();

        System.out.println("INFORME O HORARIO QUE ACABOU: ");
        int horarioFinal = sc.nextInt();

        sc.close();

        if (horarioComeco == 0 && horarioFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORAS");
        } else if (horarioComeco == horarioFinal) {
            System.out.println("O JOGO DUROU MENOS DE UMA HORA");
        } else if (horarioComeco > horarioFinal) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (24 - horarioComeco + horarioFinal));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (horarioFinal - horarioComeco));
        }

    }
}
