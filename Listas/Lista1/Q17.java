

import java.util.Scanner;

public class Q17 {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void question(){

        System.out.print("Infome o primeiro valo do intervalo: ");
        int x = scanner.nextInt();
        System.out.print("Infome o primeiro valo do intervalo: ");
        int y = scanner.nextInt();

        System.out.println("While: ");

        int w = x;
        while (w<=y) {
            if (w%2 != 0) System.out.print(" "+w);
            w++;
        }

        System.out.println("\nDo-While: ");

        int d = x;
        do {
            if (d%2 != 0)System.out.print(" "+d);
            d++;
        } while (d<=y);

        System.out.println("\nFor: ");

        for (int f = x; f <= y; f++){
            if (f%2 != 0)System.out.print(" "+f);
        }
    }
}
