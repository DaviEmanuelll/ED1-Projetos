

import java.util.Scanner;

public class Q8 {
    
    private static Scanner scanner = new Scanner(System.in); 

    public static void question() {

        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        if (altura != 0) {
            System.out.println("IMC = " + (peso/(altura*altura)));
        }
        else{
            System.out.println("IMPOSSIVEL DIVIDIR VALOR POR 0");
        }
        
    }
}
