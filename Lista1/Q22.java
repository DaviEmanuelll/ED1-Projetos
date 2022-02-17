package Lista1;

import java.util.Scanner;

public class Q22 {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void question(){
        System.out.print("Informe um fatorial: ");
        int num = scanner.nextInt();

        int fatorial=1;

        System.out.print(num+"! = ");
        for(int i=1;i<=num;i++){
            fatorial=fatorial*i;
            System.out.print(i);
            if(i!=num) System.out.print(" x ");
        }

        System.out.println(" = "+fatorial);

    }
    
}
