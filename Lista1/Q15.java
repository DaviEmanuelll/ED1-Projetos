package Lista1;

import java.util.Scanner;

public class Q15 {

    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){
        String num[] = {"UM","DOIS","TRES","QUATRO","CINCO"};
        
        System.out.print("Informe um valor: ");
        int val = scanner.nextInt();

        if (val>=1 && val<=5) System.out.println("Você digitou o vaor "+num[val-1]);
        else System.out.println("Valor invalido");
    }

}
