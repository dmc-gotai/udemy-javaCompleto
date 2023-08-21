//import java.util.Scanner;
import java.util.Calendar;


public class EstruturaCondicional {
    public static void main(String[] args) {
        // System.out.println("Que horas sao?");
        // Scanner sc = new Scanner(System.in);
        // int horas = sc.nextInt();
        // sc.close();
        int horas = Calendar.HOUR;
        
        if(horas <= 12) {
            System.out.println("Bom dia!");
        } else if (horas < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        
    }
}
