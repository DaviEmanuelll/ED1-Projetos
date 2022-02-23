

import java.util.Scanner;

public class Q6 {

    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){
        float refri = 1.50f;
        float pizza = 3f;
        float taxaGarcom = 0.1f;
        int quatRefri;
        int quantPizza;
        int numPessoas;

        System.out.println("==================================");
        System.out.println("COMANDA");
        System.out.println("==================================");
        System.out.print("Fatias de Pizza: ");
        quantPizza = scanner.nextInt();
        System.out.print("Refri: ");
        quatRefri = scanner.nextInt();
        System.out.print("Pessoas: ");
        numPessoas = scanner.nextInt();

        float total = (quantPizza*pizza)+(quatRefri*refri);
        float totalTaxa = total+(total*taxaGarcom);
        System.out.println("\n==================================");
        System.out.println("Total:                  R$ "+total);
        System.out.println("*Taxa do garçom(10%):   R$ "+totalTaxa);
        System.out.println("Rateio:                 R$ "+(totalTaxa/numPessoas));
        System.out.println("==================================");

    }
}
