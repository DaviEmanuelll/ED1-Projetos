

import java.util.Scanner;

public class Q10 {
    
    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){
        
        System.out.print("Valor: ");
        int valor = scanner.nextInt();

        String num = (valor%2==0)? "Par" : "Impar";
        System.out.println(valor+" é um numero "+num);
    }
}
