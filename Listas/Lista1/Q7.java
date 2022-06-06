

import java.util.Scanner;

public class Q7 {
    
    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){

        System.out.print("X = ");
        float x = scanner.nextFloat();
        System.out.print("Y = ");
        float y = scanner.nextFloat();

        if (y != 0) {
            System.out.println("O resultado de "+x+"/"+y+" é igual a: "+(x/y));
        }
        else{
            System.out.println("IMPOSSIVEL DIVIDIR VALOR POR 0");
        }
                
    }
}
