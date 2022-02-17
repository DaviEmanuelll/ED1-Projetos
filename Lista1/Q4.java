package Lista1;

import java.util.Scanner;

public class Q4 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question() {
        
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = ");
        int y = scanner.nextInt();
        System.out.print("Z = ");
        int z = scanner.nextInt();

        System.out.println("A media dos valores "+x+", "+y+" e "+z+" é igual a "+((x+y+z)/3));
        
    }


}
