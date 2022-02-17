package Lista1;

import java.util.Scanner;

public class Q5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void question() {

        System.out.print("X = ");
        float x = scanner.nextFloat();
        System.out.print("Y = ");
        float y = scanner.nextFloat();
        System.out.print("Z = ");
        float z = scanner.nextFloat();

        System.out.println("A media dos valores "+x+", "+y+" e "+z+" é igual a "+((x+y+z)/3));        
    }

}
