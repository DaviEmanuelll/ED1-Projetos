

import java.util.Scanner;

public class Q12 {
    
    private static Scanner scanner = new Scanner(System.in); 
    
    public static void question(){
        System.out.print("Informe a sua média: ");
        float med = scanner.nextFloat();

        String status;
        if (med >= 7) status = "APROVADO";
        else status = (med<4)? "REPROVADO" : "FINAL";

        System.out.println("Status: "+status);
    }
}
