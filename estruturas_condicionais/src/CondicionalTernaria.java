import java.util.Scanner;
public class CondicionalTernaria {
    
    public static void main(String[] args) {
        System.out.println("SABADO OU DOMINGO? S/N");
        
        Scanner sc = new Scanner(System.in);
        char simOuNao = sc.next().charAt(0);
        sc.close();

        boolean fds = (simOuNao == 'S' || simOuNao == 's') ? true : false;
        System.out.printf("FINAL DE SEMANA? %b", fds);

    }
}
