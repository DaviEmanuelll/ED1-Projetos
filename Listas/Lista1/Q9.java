

import java.lang.Math;

import java.util.Scanner;

public class Q9 {
    
    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){

        System.out.print("Raio: ");
        float r = scanner.nextFloat();

        if (r>=0){
            System.out.println("Área: "+(Math.PI*(r*r)));
        }
        else{
            System.out.println("IMPOSSIVEL calcular com o valor do raio = 0");
        }
        
    }
}
