import java.util.Scanner;

public class Q24 {

    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.println("Numero de dados: ");
        int tam = scanner.nextInt();

        int num[] = new int[tam];

        for(int i = 0; i<tam;i++){
            System.out.print("Informe o "+(i+1)+"° num:");
            num[i] = scanner.nextInt();
        }

        System.out.print("\nVet = [ ");
        for(int i = 0; i<tam; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("]");
    }
    
}
