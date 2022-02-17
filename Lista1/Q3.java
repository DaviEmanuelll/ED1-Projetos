package Lista1;

import java.util.Scanner;

public class Q3 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question() {
        System.out.print("\nX = ");
                int x = scanner.nextInt();
                System.out.print("Y = ");
                int y = scanner.nextInt();
    
                System.out.println("\nSoma: "+x+" + "+y+" = "+ (x+y));
                System.out.println("Subtração: "+x+" - "+y+" = "+ (x-y));
                System.out.println("Multiplicação: "+x+" * "+y+" = "+ (x*y));
                System.out.println("Divisão: "+x+" / "+y+" = "+ (x/y));
                System.out.println("Resto: "+x+" % "+y+" = "+(x%y));
    }
}
