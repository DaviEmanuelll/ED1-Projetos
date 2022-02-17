package Lista1;

import java.util.Scanner;

public class Q19 {

    private static Scanner scanner = new Scanner(System.in);

    public static void question(){

        System.out.print("Informe um valor: ");
        int num = scanner.nextInt();

        for (int m=1;m<=9;m++){
            System.out.println("- "+num+"x"+m+"="+num*m);
        }
    }
}
