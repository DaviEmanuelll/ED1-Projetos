

import java.util.Scanner;

public class Q21 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Fim: ");
        int fim = scanner.nextInt();

        int soma=0;
        for (int i=inicio;i<=fim;i++) {
            soma+=i;
        }

        System.out.println(soma);

    }
}
